# lambda表达式详解

lambda表达式，也可称为闭包



匿名内部类写法

```
new Runnable() {
    @Override
    public void run() {
        System.out.println("hello ");
    }
};
```

lambda表达式写法

```
new Thread(() -> System.out.println("hello lambda")).start();
```