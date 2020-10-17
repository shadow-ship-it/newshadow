package com.web.test;

public class Test {
    public void A(){
        B();
        System.out.print("hello，");
    }
    public void B(){
        C();
        System.out.print("boy，");
    }
    public void C(){
        D();
        System.out.print("I ");
    }
    public void D(){
        E();
        System.out.print("am ");
    }
    public void E(){
        F();
        System.out.print("3 ");
    }
    public void F(){
        G();
        System.out.print("years ");
    }
    public void G(){
        System.out.print("old ");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.A();
    }
}
