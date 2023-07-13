package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class Hello {

    public static void main(String[] args) {
        System.setProperty("jna.encoding","UTF-8");
        System.out.println(DLL.INSTANCE.boo("1...world...1"));
        System.out.println(DLL.INSTANCE.boo("1...world...1"));
        System.out.println(DLL.INSTANCE.boo("world"));
        System.out.println(DLL.INSTANCE.boo("1world1"));
        System.out.println(DLL.INSTANCE.boo("world"));
        System.out.println(DLL.INSTANCE.foo(1,2));
        System.out.println(DLL.INSTANCE.boo("world"));
    }

    public interface DLL extends Library {
        DLL INSTANCE = Native.load("hello_world", DLL.class);

        String boo(String a);

        int foo(int a,int b);

    }
}
