public class Tester {

    public static void main(String[] args) {

        //Create a new door and set its name
        Door doorA = new Door();
        doorA.setRoomName();

        //Create lock and attach to door
        CardLock lock = new CardLock();
        doorA.attachLock(lock);

        //Create a new student smart card and attempt to open the door
        SmartCard cardA = new SmartCard("Anna Undergrad");
        System.out.println("* Swiping " + cardA.getOwner() + "'s card");
        lock.swipeCard(cardA);
        doorA.openDoor();

        System.out.println();

        //Create a new staff smart card and attempt to open the door
        SmartCard cardB = new SmartCard("Dr. Bob Lecturer");
        cardB.setStaff();
        lock.swipeCard(cardB);
        doorA.openDoor();

    }
}
