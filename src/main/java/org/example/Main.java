package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(hello("1...world...1"));
    }

    static {
        System.load("D:\\IdeaProjects\\RustDemo\\src\\main\\resources\\_3dtile.dll");
    }

    static native String hello(String a);
}