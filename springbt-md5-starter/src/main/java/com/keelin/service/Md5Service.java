package com.keelin.service;

import com.keelin.util.Md5Util;

public class Md5Service {
    public String getMD5( String input ) {
        return Md5Util.getMD5( input.getBytes() );
    }
}