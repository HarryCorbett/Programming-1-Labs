public abstract class Carnivore extends Animal {

    /**
     * Constructor for carnivore
     * @param name of carnivore
     * @param age of carnivore
     */
    public Carnivore(String name, int age) {
        super(name, age);
    }

    /**
     * Eat method for carnivore
     * @param food that the animal will eat
     * @throws Exception if carnivore is fed a plant
     */
    public void eat(Food food) throws Exception {
        if (food instanceof Plant) {
            throw new Exception("Carnivores do not eat plants");  // Throw an exception if a carnivore is fed plants
        } else {
            System.out.println(this.getName() + " ate the " + food.getName());
        }
    }
}
