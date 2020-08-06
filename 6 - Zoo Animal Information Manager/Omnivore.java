public abstract class Omnivore extends Animal {

    /**
     * Constructor for omnivore
     * @param name of omnivore
     * @param age of omnivore
     */
    public Omnivore(String name, int age) {
        super(name, age);
    }

    /**
     * Eat method for omnivores
     * @param food that the animal will eat
     */
    public void eat(Food food){
        System.out.println(this.getName() + "ate the " + food.getName());
    }

}
