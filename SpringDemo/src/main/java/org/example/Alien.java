package org.example;

// constructor injection is used when the dependency is required whereas when the dependency is optional.

public class Alien {

    private Ship ship;
    private int age = 3;

    public Alien() {
        System.out.println("Alien is being constructed");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

//    public Alien(SpaceShip spaceship) {
//        this.spaceship = spaceship;
//    }

    public void build() {
        System.out.println("Aliens are building ships");
        ship.fly();
    }
}
