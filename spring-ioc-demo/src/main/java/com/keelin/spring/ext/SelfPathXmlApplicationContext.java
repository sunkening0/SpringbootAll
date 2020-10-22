package com.keelin.spring.ext;

import com.keelin.annotation.SelfAutowired;
import com.keelin.annotation.SelfService;
import com.keelin.utils.ClassParseUtil;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 容器
 * @author: skn
 * @create: 2020-10-22 10:04
 */
public class SelfPathXmlApplicationContext {
    private String packageName;

    // 封装所有的bean容器
    private ConcurrentHashMap<String, Object> beans = null;

    /**
     * 该类被创建出来的时候加载
     * @param packageName
     * @throws Exception
     */
    public SelfPathXmlApplicationContext(String packageName) throws Exception {
        beans = new ConcurrentHashMap<String, Object>();
        this.packageName = packageName;
        initBeans();
        initEntryField();
    }

    /**
     * 初始化bean的实例对象的所有属性
     * @throws Exception
     */
    private void initEntryField() throws Exception {
        // 1.遍历所有的bean容器对象
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            // 2.判断属性上面是否有加注解
            Object bean = entry.getValue();
            attriAssign(bean);
        }
    }

    /**
     * 根据beanId获取bean名称
     * @param beanId
     * @return
     * @throws Exception
     */
    public Object getBean(String beanId) throws Exception {
        if (StringUtils.isEmpty(beanId)) {
            throw new Exception("beanId参数不能为空");
        }
        // 1.从spring容器获取bean
        Object object = beans.get(beanId);
        // attriAssign(object);
        return object;
    }

    /**
     * 获取扫描包下面的所有bean
     */
    private void initBeans() throws Exception {
        // 1.使用java的反射机制扫包,[获取当前包下所有的类]
        List<Class<?>> classes = ClassParseUtil.getClasses(packageName);
        // 2、判断类上面是否存在注入的bean的注解
        ConcurrentHashMap<String, Object> classExisAnnotation = findClassExisAnnotation(classes);
        if (classExisAnnotation == null || classExisAnnotation.isEmpty()) {
            throw new Exception("该包下没有任何类加上注解");
        }

    }

    /**
     * 判断类上是否存在注入自定义的bean的注解
     * @param classes
     * @return
     * @throws Exception
     */
    public ConcurrentHashMap<String, Object> findClassExisAnnotation(List<Class<?>> classes) throws Exception {
        for (Class<?> classInfo : classes) {
            // 判断类上是否有注解 [获取自定义的service注解]
            SelfService annotation = classInfo.getAnnotation(SelfService.class);
            if (annotation != null) {
                // 获取当前类的类名
                String className = classInfo.getSimpleName();
                String beanId = toLowerCaseFirstOne(className);
                Object newInstance = newInstance(classInfo);
                beans.put(beanId, newInstance);
            }

        }
        return beans;
    }

    // 首字母转小写
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    /**
     * 通过class名称获取类的实例化对象
     * @param classInfo
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Object newInstance(Class<?> classInfo)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return classInfo.newInstance();
    }

    /**
     * 依赖注入注解原理
     * @param object
     * @throws Exception
     */
    public void attriAssign(Object object) throws Exception {

        // 1.使用反射机制,获取当前类的所有属性
        Class<? extends Object> classInfo = object.getClass();
        Field[] declaredFields = classInfo.getDeclaredFields();

        // 2.判断当前类属性是否存在注解
        for (Field field : declaredFields) {
            SelfAutowired extResource = field.getAnnotation(SelfAutowired.class);
            if (extResource != null) {
                // 获取属性名称
                String beanId = field.getName();
                Object bean = getBean(beanId);
                if (bean != null) {
                    // 3.默认使用属性名称，查找bean容器对象 1参数 当前对象 2参数给属性赋值
                    field.setAccessible(true); // 允许访问私有属性
                    field.set(object, bean);
                }
            }
        }

    }

}