package dz2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Fish fish = new Fish();

        clinic.addAnimal((Soundable) dog);
        clinic.addAnimal((Soundable) cat);
        clinic.addAnimal((Soundable) bird);

        clinic.addAnimal((Runnable) dog);
        clinic.addAnimal((Runnable) cat);

        clinic.addAnimal((Flyable) bird);

        clinic.addAnimal((Swimable) fish);

        List<Soundable> soundables = clinic.getAllSoundables();
        List<Runnable> runnables = clinic.getAllRunnables();
        List<Flyable> flyables = clinic.getAllFlyables();
        List<Swimable> swimables = clinic.getAllSwimables();

        for (Soundable soundable : soundables) {
            System.out.println("Скорость звукопроизводящего животного: " + soundable.getSpeed());
        }

        for (Runnable runnable : runnables) {
            System.out.println("Скорость бегающего животного: " + runnable.getSpeed());
        }

        for (Flyable flyable : flyables) {
            System.out.println("Скорость летающего животного: " + flyable.getSpeed());
        }

        for (Swimable swimable : swimables) {
            System.out.println("Скорость плавающего животного: " + swimable.getSpeed());
        }
    }
}

