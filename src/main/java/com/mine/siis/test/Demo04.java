package com.mine.siis.test;

public class Demo04 {
    public static void main(String[] args) {
        Man man = new Man();
        man.help();
    }

}
interface Filial{
    default void help(){
        System.out.println("老妈，我来救你了");
    }
}

interface spoony{
    default void help(){
        System.out.println("媳妇，别怕，我来了");
    }
}
class Man implements Filial,spoony{

    @Override
    public void help() {
        System.out.println("我该怎么办呢？");

    }

}
