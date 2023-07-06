package project;

import java.util.ArrayList;
import java.util.List;

class VeterinaryClinic {
    private List<Soundable> soundables;
    private List<Runnable> runnables;
    private List<Flyable> flyables;
    private List<Swimable> swimables;

    public VeterinaryClinic() {
        soundables = new ArrayList<>();
        runnables = new ArrayList<>();
        flyables = new ArrayList<>();
        swimables = new ArrayList<>();
    }

    public void addAnimal(Soundable soundable) {
        soundables.add(soundable);
    }

    public void addAnimal(Runnable runnable) {
        runnables.add(runnable);
    }

    public void addAnimal(Flyable flyable) {
        flyables.add(flyable);
    }

    public void addAnimal(Swimable swimable) {
        swimables.add(swimable);
    }

    public List<Soundable> getAllSoundables() {
        return soundables;
    }

    public List<Runnable> getAllRunnables() {
        return runnables;
    }

    public List<Flyable> getAllFlyables() {
        return flyables;
    }

    public List<Swimable> getAllSwimables() {
        return swimables;
    }
}
