package dz1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.toGo(); // Animal is moving
        animal.fly(); // Animal is flying
        animal.swim(); // Animal is swimming

        FlyingAnimal flyingAnimal = new FlyingAnimal();
        flyingAnimal.toGo(); // Animal is moving (наследуется от класса Animal)
        flyingAnimal.fly(); // FlyingAnimal is flying (переопределение метода fly())
        flyingAnimal.swim(); // Animal is swimming (наследуется от класса Animal)

        SwimmingAnimal swimmingAnimal = new SwimmingAnimal();
        swimmingAnimal.toGo(); // Animal is moving (наследуется от класса Animal)
        swimmingAnimal.fly(); // Animal is flying (наследуется от класса Animal)
        swimmingAnimal.swim(); // SwimmingAnimal is swimming (переопределение метода swim())

        RunningAnimal runningAnimal = new RunningAnimal();
        runningAnimal.toGo(); // Animal is moving (наследуется от класса Animal)
        runningAnimal.fly(); // Animal is flying (наследуется от класса Animal)
        runningAnimal.swim(); // Animal is swimming (наследуется от класса Animal)
    }
}

