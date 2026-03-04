package com.app.depencency;

import org.springframework.stereotype.Component;

@Component
public class SpaceYaan implements Ship {
    
    public void launch() {
        System.out.println("SpaceYaan is launching...");
    }
}
