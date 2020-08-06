public class Parrot extends Omnivore{

    /**
     * Constructor for the parrot class
     * @param name of parrot
     * @param age of parrot
     */
    public Parrot(String name, int age) {
        super(name,age);
    }

    /**
     * Allow the parrot to make a noise
     */
    public void makeNoise(){
        System.out.println("Squark");
    }
}
