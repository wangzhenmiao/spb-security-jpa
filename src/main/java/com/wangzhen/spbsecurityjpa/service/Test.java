package com.wangzhen.spbsecurityjpa.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName Test
 * @Description
 * @Author momo
 * @Date 2019/2/7 下午8:30
 **/
public class Test {

    //这个主要是自己抽离出加密算法，拿到密码的加密结果
    public static void main(String[] args) {
        String str = new BCryptPasswordEncoder().encode("admin");
        System.out.println(str);
    }
}
