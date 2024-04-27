package org.example;

public class TaskZooTester {
    public static void main(String[] args) {
       Animal[] animalBehaviors={new Elephant("Dumbo",21),new Lion("Mepe",12),new Eagle("Arwivi",13),new Parrot("Kesha",4)};
       for(Animal animals:animalBehaviors){
           animals.displayInformation();
           System.out.println("****************");

           animals.eat();
           animals.sleep();
           animals.makeSound();

           System.out.println();



       }
    }

}
