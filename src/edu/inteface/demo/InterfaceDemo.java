package edu.inteface.demo;

interface IBird {

    void fly();

    void sing();
}

interface IAnimal {

    void getAge();

    void homeland();
}


interface IFish {

    void swim();

}

interface Swimable {

    void swimm();
}

interface Flyable {

    void fly();
}


class Eagle implements IBird {

    @Override
    public void fly() {
        System.out.println("Eagle fly high");
    }

    @Override
    public void sing() {
        System.out.println("Uiuiui");
    }
}

class Penguin implements IBird, Swimable {


    @Override
    public void swimm() {
        System.out.println("swim very well");
    }

    @Override
    public void fly() {
        System.out.println("don't fly");
    }

    @Override
    public void sing() {
        System.out.println("squeak of different tonality");
    }
}

class Leopard implements IAnimal, Flyable {


    @Override
    public void getAge() {
        System.out.println("Live up to 17 years");
    }

    @Override
    public void homeland() {
        System.out.println("Africa");

    }

    @Override
    public void fly() {
        System.out.println("don't fly");
    }
}

public class InterfaceDemo {

    public static void main(String args[]) {
        Eagle bird = new Eagle();
        System.out.println("Eagle");
        bird.fly();
        bird.sing();
        System.out.println();
        System.out.println("Penguin");
        Penguin fish = new Penguin();
        fish.swimm();
        fish.fly();
        fish.sing();
        System.out.println();
        System.out.println("Leopard");
        Leopard animal = new Leopard();
        animal.getAge();
        animal.homeland();
        animal.fly();
    }
}

