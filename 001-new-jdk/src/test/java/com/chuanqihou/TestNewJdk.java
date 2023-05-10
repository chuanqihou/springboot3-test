package com.chuanqihou;

import com.chuanqihou.entity.Student;
import org.junit.Test;

import java.util.StringJoiner;

/**
 * @author 传奇后
 * @date 2023/5/10 15:08
 * @description
 */
public class TestNewJdk {

    @Test
    public void testStringJoin() {
        StringJoiner joiner = new StringJoiner("-");
        String s = joiner.add("abc").add("efg").add("hij").toString();
        System.out.println(s);

        StringJoiner sj = new StringJoiner("-", "[", "]");
        String s1 = sj.add("a").add("b").add("c").toString();
        System.out.println(s1);
    }

    @Test
    public void testStudent01() {
        Student student = new Student(1001, "lisi");
        System.out.println(student);
        Integer id = student.id();
        System.out.println(id);
        System.out.println(student.concat());

        System.out.println(Student.emailUpperCase("chuanqihou@qq.com"));

        Student s = new Student(1002);
        System.out.println(s);
    }

    @Test
    public void testInstanceof() {
        Student student = new Student(1001, "lisi");

        Object obj = student;
        if (obj instanceof Student) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    @Test
    public void testString() {
        String str = """
                你好
                世界
                """;
        System.out.println(str);

        str = """
                你好
                    世界
                """;
        System.out.println(str);

        str = """
                nihao\
                shijie
                """;
        System.out.println(str);

    }

    @Test
    public void testVar() {
        var a = "123";
        System.out.println(a);
        System.out.println(a instanceof String);
    }

}
