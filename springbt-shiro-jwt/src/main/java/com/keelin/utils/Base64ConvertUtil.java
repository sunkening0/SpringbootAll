package com.keelin.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base64工具
 */
public class Base64ConvertUtil {

    private Base64ConvertUtil() {}

    /**
     * 加密JDK1.8
     */
    public static String encode(String str) throws UnsupportedEncodingException {
        byte[] encodeBytes = Base64.getEncoder().encode(str.getBytes("utf-8"));
        return new String(encodeBytes);
    }

    /**
     * 解密JDK1.8
     */
    public static String decode(String str) throws UnsupportedEncodingException {
        byte[] decodeBytes = Base64.getDecoder().decode(str.getBytes("utf-8"));
        return new String(decodeBytes);
    }

}
