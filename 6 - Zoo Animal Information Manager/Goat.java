public class Goat extends Herbivore {

    /**
     * Constructor for Goat
     * @param name of goat
     * @param age of goat
     */
    public Goat(String name, int age) {
        super(name, age);
    }

    /**
     * allows the Goat to make a noise
     */
    public void makeNoise(){
        System.out.println("bleat");
    }
}
