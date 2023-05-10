package com.chuanqihou;

import java.util.StringJoiner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        record User(Integer id,String name){};

        User user = new User(1, "尼斯");
        System.out.println(user);

    }
}
