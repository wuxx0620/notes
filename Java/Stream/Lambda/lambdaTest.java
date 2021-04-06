package com.wuxx.test;

public class lambdaTest {
    // 1.前置条件 必须是函数式接口
    // 2.参数的传递
    // 3.代码编写方式
    // 4.方法引用
    public static void main(String[] args) {
        //参数可以忽略类型
        //参数只有一个可以省略括号
        run(name -> String.format("name:%s", name));

        /**
         * 代码编写特性
         * 1.单行表达式 可以省略return
         * 2.代码块 多行表达式
         */
        run(name -> "name" + name);
        run((name -> {
            String name1 = name;
            return name1;
        }));

        //静态方法引用
        run(lambdaTest::doFormat);
        //普通方法
        run(new lambdaTest()::doFormat1);
    }

    public static String doFormat(String param) {
        return "name" + param;
    }

    public String doFormat1(String param) {
        return "name" + param;
    }

    public static void run(MyRun r) {
        r.run("吴曦");
    }

    @FunctionalInterface
    public interface MyRun {
        String run(String name);
    }
}
