package com.guix.leecodedemo.entity;

/**
 * @ClassName User
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/30 0030 下午 22:27
 * @Version 1.0
 **/
public class User {
    private int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
