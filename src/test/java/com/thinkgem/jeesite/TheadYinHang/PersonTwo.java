package com.thinkgem.jeesite.TheadYinHang;

public class PersonTwo extends Person {

    String userName;
    int age;

    public PersonTwo(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
