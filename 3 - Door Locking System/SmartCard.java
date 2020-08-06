/**
 * A smart card used to enter buildings
 */
public class SmartCard {

    private String name;
    private boolean staff;

    /**
     * Contructor that sets the owner
     *
     * @param name owner of the card
     */
    SmartCard(String name) {
        this.setName(name);
    }

    public SmartCard(String name, boolean staff) {
        this.setName(name);
        if (staff) {
            this.setStaff();
        }
    }

    /**
     * set and recieve card details
     *
     * @param name Card details
     */
    private void setName(String name) {
        this.name = name;
    }

    String getOwner() {
        return this.name;
    }

    /**
     * Set and recieve if the card belongs to a staff member
     *
     */
    void setStaff() {
        this.staff = true;
    }

    boolean isStaff() {
        return this.staff;
    }
}