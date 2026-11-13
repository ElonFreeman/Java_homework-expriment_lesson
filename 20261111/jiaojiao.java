abstract class Animal {
    public abstract void cry();
    
    public abstract String getAnimalName();
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("wang");
    }

    @Override
    public String getAnimalName() {
        return "dog";
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("miao");
    }

    @Override
    public String getAnimalName() {
        return "cat";
    }
}

class Simulator {
  
    public void playSound(Animal animal) {
        System.out.print(animal.getAnimalName() + "sound is:");
        animal.cry();
    }
}

public class jiaojiao {
    public static void main(String[] args) {

        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}