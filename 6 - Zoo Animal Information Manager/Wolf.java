public class Wolf extends Carnivore {

    /**
     * Constructor for Wolf
     * @param name of the wolf
     * @param age of the wolf
     */
    public Wolf(String name, int age) {
        super(name,age);
    }

    /**
     * allows the wolf to make a noise
     */
    public void makeNoise(){
        System.out.println("Awooo");
    }


}
