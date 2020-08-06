/**
 * Card lock for controlling access to a building
 */

public class CardLock {

    private SmartCard lastCardSeen = null;
    private boolean studentAccess = false;

    /**
     * Stores the details of the last card used on the lock
     *
     * @param card
     */
    void swipeCard(SmartCard card) {

        this.lastCardSeen = card;

    }

    public void toggleStudentAccess() {

        this.studentAccess = !this.studentAccess;

    }

    /**
     * Returns the details of the last card used on the lock
     *
     * @return last card scanned
     */
    SmartCard getLastCardSeen() {

        return this.lastCardSeen;

    }

    /**
     * checks if the lock should unlokc for that card
     *
     * @return if the door is unlocked
     */
    boolean isUnlocked() {

        return lastCardSeen.isStaff() || studentAccess;
    }
}
