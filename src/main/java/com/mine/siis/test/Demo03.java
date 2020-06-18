package com.mine.siis.test;

public interface Demo03 {

    double PI = 3.14;
    public default void method() {
        System.out.println("北京");
    }
    default String method1() {
        return "上海";
    }
    public static void method2() {
        System.out.println("hello lambda!");
    }
}
