public class Main {

    /**
     * Main method used to test the functionality of all classes
     * @param args
     */
    public static void main(String[] args) {

        // create a wolf and parrot
        Wolf wolf = new Wolf("Wolf", 5);
        Parrot parrot = new Parrot("Parrot", 4);
        Goat goat = new Goat("Goat", 7);

        // test each animal making a noise
        wolf.makeNoise();
        parrot.makeNoise();
        goat.makeNoise();

        // Create meat and plant objects
        Meat meat = new Meat("beef");
        Plant plant = new Plant("leaf");

        // Have each animal eat, get an error if an animal is unable to eat that food
        try {
            wolf.eat(meat);
            parrot.eat(meat);
            goat.eat(plant);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Have animals attempt to eat food they do not eat, print the error returned
        try {
            goat.eat(meat);
            wolf.eat(plant);
        } catch (Exception e) {  // If an exception is returned output it
            System.err.print(e);
        }
    }
}
