public abstract class Herbivore extends Animal {

    /**
     * Constructor for herbivore
     * @param name of herbivore
     * @param age of herbivore
     */
    public Herbivore(String name, int age) {
        super(name, age);
    }

    /**
     * Eat method for herbivore
     * @param food that the animal will eat
     * @throws Exception if herbivore is fed meat
     */
    public void eat(Food food) throws Exception{
        if (food instanceof Meat) {
            throw new Exception("Herbivores do not eat meat");  // throw an exception of a herbivore is fed meat
        } else {
            System.out.println(this.getName() + " ate the " + food.getName());
        }
    }
}

