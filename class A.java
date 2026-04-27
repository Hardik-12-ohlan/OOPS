package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;
    public A(int a, int b, int c) {
        pubVar = a;
        protVar = b;
        privVar = c;
    }
    public int getPrivVar() {
        return privVar;
    }
}
//B.java
package bpack;

import apack.A;

public class B extends A {

    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
	System.out.println("240390107046");
        System.out.println("From B (Subclass):");
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);  
    }
}
//C.java
package cpack;
import apack.A;
public class C {
    public void display() {
        A obj = new A(10, 20, 30);
        System.out.println("From C (Non-Subclass):");
        System.out.println("Public Variable: " + obj.pubVar);
        System.out.println("Private Variable via method: " + obj.getPrivVar());
    }
}
//ProtectedDemo.java
package dpack;

import bpack.B;
import cpack.C;
public class ProtectedDemo {
    public static void main(String[] args) {
        B objB = new B(1, 2, 3);
        objB.display();
        System.out.println();
        C objC = new C();
        objC.display();
    }
}
