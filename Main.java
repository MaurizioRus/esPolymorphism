public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("default animal");
        Lion lion = new Lion("lion");
        Cow cow = new Cow("cow");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}

