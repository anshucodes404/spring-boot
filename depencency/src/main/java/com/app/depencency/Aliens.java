package com.app.depencency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // we need to add this annotation to make this class a bean and to let spring know that this class is a component and it will create an object of this class and store it in the container
public class Aliens {

    // private SpaceShip spaceship = new SpaceShip() ;

      // field injection  // required
    // private SpaceShip spaceship;
    @Autowired
    @Qualifier("spaceShip") // to specify which bean to inject when there are multiple beans of the same type
    private Ship spaceship;

    // @Autowired // not required
    // public Aliens(SpaceShip spaceship) {   // constructor injection
    //     this.spaceship = spaceship;
    // }


    // @Autowired  // required
    // public void setSpaceship(SpaceShip spaceship) {  // setter injection
    //     this.spaceship = spaceship;
    // }

    public void build() {
        System.out.println("Aliens are building their spaceship...");

        spaceship.launch();
    }
    
}
