package config;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

public class JwtDefaultSubjectFactory extends DefaultWebSubjectFactory {

    /**
     * 由于需要实现无状态的web，所以使用不到Shiro的Session功能，严谨点就是将其关闭
     * @param context
     * @return
     */
    @Override
    public Subject createSubject(SubjectContext context) {
        // 不创建 session
        context.setSessionCreationEnabled(false);
        return super.createSubject(context);
    }
}








