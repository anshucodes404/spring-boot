package com.app.depencency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SpaceShip implements Ship {

    public void launch() {
        System.out.println("Spaceship is launching...");
    }
}

