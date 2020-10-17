package com.web.test;

public interface B extends A{
    static String hh(){
        return "jjjjjj";
    }
    default void hello(){
        System.out.println("hello from B");
    }
}
