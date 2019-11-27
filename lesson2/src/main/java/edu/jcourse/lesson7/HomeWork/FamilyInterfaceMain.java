package edu.jcourse.lesson7.HomeWork;



public class FamilyInterfaceMain {
    public static void main(String[] args) {

        FamilyInterface familyInterface1 = new FamilyInterfaceImpl1();
        FamilyInterface familyInterface2 = new FamilyInterfaceImpl2();


        System.out.println(FamilyInterfaceImpl1.calculateBMI);
        System.out.println(FamilyInterfaceImpl2.calculateBMI);
    }

}




