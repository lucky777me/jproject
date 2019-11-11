package edu.jcourse.lesson5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lion extends Animal {
    public Lion() {
    }


    @Override
    public void sayHello() {
        super.sayHello();
    }

    public Lion(String name, int age) {
        super(name, age);

        System.out.println(getName() + " says Vau ");
    }
}



