package com.mine.siis.test;

public class Demo01 {

    private static int j = 0;

    private static boolean methodB(int k) {
        j += k;
        System.out.println("private static boolean methodB");
        return true;
    }

    public static void methodA(int i) {
        System.out.println("public static void methodA");
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);
    }

    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }



}
class Person {
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        total=total; //非法，在static方法中不能有this，也不能有super
    }
    public Person() {
        total++;
        id = total;
    }}



