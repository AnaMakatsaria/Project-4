package org.example;

public interface AnimalBehavior {

            void eat();
            void sleep();
            void makeSound();

        }
        abstract  class Animal implements AnimalBehavior {
            protected String name;
            protected int age;
            public Animal(String name, int age){
                this.name=name;
                this.age=age;
            }
            public  void sleep() {

            }
           void displayInformation(){
               System.out.println(name+" "+age);
           }
        }
        abstract class Mammal extends Animal {
            public Mammal(String name, int age) {
                super(name, age);
            }

            @Override
            public void eat() {
                System.out.println();
            }

            @Override
            public void sleep() {
                super.sleep();
                System.out.println();
            }

            @Override
            public void makeSound() {
                System.out.println();
            }


        }
            class Lion extends Mammal {


                public Lion(String name, int age) {
                    super(name, age);
                }

                @Override
                public void sleep() {
                    super.sleep();
                    System.out.println("Lions sleep most of the day");
                }

                @Override
                public void makeSound() {
                    super.makeSound();
                    System.out.println("Lions roar");
                }

                @Override
                public void eat() {
                    super.eat();
                    System.out.println("Lions eat the other animals");
                }


            }
            class Elephant extends Mammal {
                public Elephant(String name, int age){
                    super(name,age);
                }

                @Override
                public void sleep() {
                    super.sleep();
                    System.out.println("Elephants sleep 2 to 6 hours a day on nighttime");
                }

                @Override
                public void eat() {
                    super.eat();
                    System.out.println("Elephants eat plant based food");
                }

                @Override
                public void makeSound() {
                    super.makeSound();
                    System.out.println("Elephants can make a variety of sounds, including trumpeting, rumbling. ");
                }


            }

        abstract class Bird extends Animal {
            public Bird(String name,int age){
                super(name,age);
            }

            @Override
            public void eat() {
                System.out.println();
            }

            @Override
            public void sleep() {
                super.sleep();
                System.out.println();
            }

            @Override
            public void makeSound() {
                System.out.println();
            }


        }
        class Parrot extends  Bird {
            public Parrot(String name,int age){
                super(name,age);
            }
            @Override
            public void eat() {
                super.eat();
                System.out.println("Parrot eats flowers, seeds, fruits ");
            }

            @Override
            public void makeSound() {
                super.makeSound();
                System.out.println("parrots can mimic sounds");
            }

            @Override
            public void sleep() {
                super.sleep();
                System.out.println("Parrots sleep 10 to 12 hours a day.");
            }


        }
      class Eagle extends Bird {
            public Eagle(String name, int age){
                super(name, age);
            }
            @Override
            public void eat() {
                super.eat();
                System.out.println("Eagles  primarily eat meat.");
            }

            @Override
            public void makeSound() {
                super.makeSound();
                System.out.println("Eagles make a variety of sounds, including high-pitched whistles");
            }

            @Override
            public void sleep() {
                super.sleep();
                System.out.println(" They sleep while perched on a branch with one eye open to stay alert to potential threats.");
            }


        }
