package com.wuxx.test;

public class User {
    private String userName;
    private String age;
    private String school;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public User(String userName, String age, String school) {
        this.userName = userName;
        this.age = age;
        this.school = school;
    }
}
