package com.app.depencency;

import org.springframework.stereotype.Component;

@Component  // we need to add this annotation to make this class a bean and to let spring know that this class is a component and it will create an object of this class and store it in the container
public class Aliens {

    public void build() {
        System.out.println("Aliens are building their spaceship...");
    }
    
}
