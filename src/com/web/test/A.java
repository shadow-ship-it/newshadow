package com.web.test;

public interface A {
    default void hello(){
        System.out.println("hello from A");
    }
}
