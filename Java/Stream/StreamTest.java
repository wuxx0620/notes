package com.wuxx.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("吴曦", "18", "北京"));
        userList.add(new User("张三", "19", "南京"));
        userList.add(new User("李四", "20", "北京"));
        userList.add(new User("王五", "21", "北京"));
        userList.add(new User("宋六", "30", "南京"));
        userList.add(new User("张七", "40", "南京"));
        userList.add(new User("李八", "30", "广东"));
        userList.add(new User("王九", "31", "广东"));
    }

    //原始方法
    private void test1() {
        for (User user : userList) {
            if (user.getUserName().equals("wuxi")) {

            }
        }
    }

    //过滤条件通过参数传递
    //  new StreamTest().test2(i -> i.getUserName().equals("wuxi") && i.getAge().equals("18"));
    private void test2(Predicate<? super User> pr) {
        List<User> list = userList.stream().filter(pr).collect(Collectors.toList());
    }

    // 原始方法
    // 求出每个学校的平均年龄
    private void test3() {
        //根据学校分组
        Map<String, List<User>> maps = new HashMap<>();
        for (User user : userList) {
            // computeIfAbsent 如果不存在 就新建一个ArrayList
            List<User> list = maps.computeIfAbsent(user.getSchool(), key -> new ArrayList<>());
            list.add(user);
        }
        //求出每个学校的平均年龄
        for (Map.Entry<String, List<User>> entry : maps.entrySet()) {
            int age = 0;
            for (User user : entry.getValue()) {
                age += Integer.parseInt(user.getAge());
            }
            System.out.println(age / entry.getValue().size());
        }
    }

    //  Stream方式
    private void test4() {
        // 基于学校分组
        userList.stream().collect(Collectors.groupingBy(User::getSchool,
                //求出平均年龄
                Collectors.averagingInt(i -> Integer.parseInt(i.getAge()))));
    }

    public static void main(String[] args) {
        new StreamTest().test2(i -> i.getUserName().equals("wuxi") && i.getAge().equals("18"));
    }
}
