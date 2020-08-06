/**
 * A door with an optional card lock.
 * Lab 3 COMP1202.
 *
 * @author systjeh
 */
class Door {
    private String roomName;
    private CardLock lock;

    /**
     * Construct a new Door (to nowhere) with no lock.
     */
    Door() {
        roomName = "Nowhere";
        lock = null;
    }

    /**
     * Set the name of the room that this door is attached to.
     */
    void setRoomName() {
        roomName = "Research Labs";
    }

    /**
     * Set the lock that is attached to this door.
     */
    void attachLock(CardLock lock) {
        this.lock = lock;
    }

    /**
     * A method that attempts to open the door.
     */
    void openDoor() {
        boolean isUnlocked;

        System.out.println("Trying to open the door to " + roomName + "...");

        // See whether the lock variable points to a lock or if it is null.
        if (lock == null) {
            // A door with no lock is always unlocked.
            System.out.println("This door has no lock!");
            isUnlocked = true;
        } else {
            // Find out who last swiped their card
            System.out.println("(the last person to swipe their card was " + lock.getLastCardSeen().getOwner() + ")");

            // Ask the lock if the door can be opened.
            isUnlocked = lock.isUnlocked();
        }

        if (isUnlocked) {
            System.out.println("The door is open.");
        } else {
            System.out.println("The door won't open!");
        }
    }
}