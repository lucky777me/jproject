package edu.jcourse.lesson7.Interfacedemo;

public class InterfaceMain {
    public static void main(String[] args) {
        MyInterface myInterface1 = new MyInterfaceImpl();
        MyInterface myInterface2 = new MyInterfaceImpl2();

        System.out.println(myInterface1.calculatedistance());
        System.out.println(myInterface2.calculatedistance());
    }
}
