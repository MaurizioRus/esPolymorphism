class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println(getAnimalName() + " roars like a lion");
    }
}

