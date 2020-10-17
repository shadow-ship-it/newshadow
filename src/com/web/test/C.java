package com.web.test;

public class C extends D implements A,B{

    public static void main(String[] args) {
        new C().hello();
        System.out.println(B.hh());
    }
}
