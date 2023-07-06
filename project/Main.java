package project;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //     VeterinaryClinic clinic = new VeterinaryClinic();

    //     Dog dog = new Dog();
    //     Cat cat = new Cat();
    //     Bird bird = new Bird();
    //     Fish fish = new Fish();

    //     clinic.addAnimal((Soundable) dog);
    //     clinic.addAnimal((Soundable) cat);
    //     clinic.addAnimal((Soundable) bird);

    //     clinic.addAnimal((Runnable) dog);
    //     clinic.addAnimal((Runnable) cat);

    //     clinic.addAnimal((Flyable) bird);

    //     clinic.addAnimal((Swimable) fish);

    //     List<Soundable> soundables = clinic.getAllSoundables();
    //     List<Runnable> runnables = clinic.getAllRunnables();
    //     List<Flyable> flyables = clinic.getAllFlyables();
    //     List<Swimable> swimables = clinic.getAllSwimables();

    //     for (Soundable soundable : soundables) {
    //         System.out.println("Скорость звукопроизводящего животного: " + soundable.getSpeed());
    //     }

    //     for (Runnable runnable : runnables) {
    //         System.out.println("Скорость бегающего животного: " + runnable.getSpeed());
    //     }

    //     for (Flyable flyable : flyables) {
    //         System.out.println("Скорость летающего животного: " + flyable.getSpeed());
    //     }

    //     for (Swimable swimable : swimables) {
    //         System.out.println("Скорость плавающего животного: " + swimable.getSpeed());
    //     }
    // }

        DogDrug dogDrug = new DogDrug();

        ComponentA componentA = new ComponentA("Component A", "10g", 5);
        ComponentB componentB = new ComponentB("Component B", "20g", 10);

        dogDrug.addComponent(componentA); 
        dogDrug.addComponent(componentB);

        Iterator<Component> iterator = dogDrug;

        while(iterator.hasNext())
        {
            Component component = iterator.next();
            System.out.println("Name: " + component.getName());
            System.out.println("Weight: " + component.getWeight());
            System.out.println("Power: " + component.getPower());
            System.out.println();
        }
    }
}

