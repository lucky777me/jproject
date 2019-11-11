package edu.jcourse.lesson5;


public class Cat extends Animal {      // extend - nasledovanie -pisat vsegda - rashirenie klass
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);


    }

    @Override
    public void sayHello() {
        super.sayHello();

        System.out.println(getName() + " says Meow ");

    }
     public void finalize (){
         System.out.println(" Finalize Class ");

     }
    @Override
    public String toString() {

        return " Kotik " + getName ();
    }

}
