package com.chuanqihou.entity;

import java.util.Optional;

/**
 * @author 传奇后
 * @date 2023/5/10 14:51
 * @description
 */
public record Student(Integer id,String name) {

    public String concat() {
        return String.format("姓名：%s,年龄：%d", this.name, this.id);
    }

    public static String emailUpperCase(String email) {
        return Optional.ofNullable(email).orElse("no email").toUpperCase();
    }

    public Student{
        System.out.println("紧凑型构造方法");
    }

    public Student(Integer id) {
        this(id, null);
        System.out.println("自定义构造方法");
    }

}
