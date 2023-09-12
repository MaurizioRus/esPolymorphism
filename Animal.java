public class Animal {

    private String animalName;

    public Animal(String name) {
        animalName = name;
    }

    public void animalSound() {
        System.out.println(animalName + " makes an animal sound");
    }

    public String getAnimalName() {
        return animalName;
    }

}


