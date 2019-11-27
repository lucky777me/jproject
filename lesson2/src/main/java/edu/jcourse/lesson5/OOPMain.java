package edu.jcourse.lesson5;




public class OOPMain {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName(" Abstract Animal ");
        animal.setAge();
        animal.sayHello();


        Cat cat = new Cat();
        cat.setName(" Pushok ");
        cat.sayHello();
        cat.setAge(9);
        cat.printAge();


        Dog dog = new Dog();
        dog.setName("Sharik ");
        dog.setAge(8);
        dog.sayHello();
        dog.printAge();


        Tiger tiger = new Tiger();
        tiger.setName(" Vasja ");
        tiger.setAge(3);
        tiger.sayHello();
        tiger.printAge();

        Lion lion = new Lion();
         lion.setName("Pupsik");
         lion.setAge(8);
         lion.sayHello();
         lion.printAge();



        System.out.println(animal);
        System.out.println(cat);
        System.out.println(tiger);
    }


    public static void test(Cat cat) {
        if (cat instanceof Animal); {
    }

}



}

