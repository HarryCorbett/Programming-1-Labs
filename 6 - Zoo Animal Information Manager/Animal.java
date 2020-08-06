/**
 * Stores information about animals
 * Extended by Carnivore, Herbivore and Omnivore
 */
public abstract class Animal {

    private String name;
    private int age;

    /**
     * Constructor for animal
     * @param name of animal
     * @param age of animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * get name of animal
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * get age of animal
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * abstract method for make noise
     */
    public abstract void makeNoise();

    /**
     * Abstract method for animals eating
     * @param food that the animal will eat
     * @throws Exception if animal does not eat that type of food
     */
    public abstract void eat(Food food) throws Exception;


}
