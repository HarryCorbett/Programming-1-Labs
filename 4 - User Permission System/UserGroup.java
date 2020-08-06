import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup {

    // create the array list
    private ArrayList<User> users;

    UserGroup() {
        users = new ArrayList<>();
    }

    /**
     * Returns the array list of users
     *
     * @return users array list
     */
    ArrayList<User> getUsers() {
        return users;
    }

    void add(User user) {
        users.add(user);
    }


    /**
     * Adds 5 test users to the array list users
     *
     */
    void addSampleData() {

        for (int i = 0; i < 4; i++) {

            users.add(new User("username" + i, "admin", "name" + i));

        }
    }

    /**
     * Takes in a value and outouts the data of the user at that index in the arraylist users
     *
     * @return specified users information
     */
    public User getUser(int value) {

        return users.get(value);
    }

    void printUsernames() {

        for (User n : users) {

            System.out.println(n.getUsername() + " " + n.getUserType());

        }

    }

    /**
     * Remove the first user from the array list
     */
    public void removeFirstUser() {

        users.remove(0);
    }

    /**
     * Removes the last user from the array list
     * (final user is 1 less than the amount of elements in the array list, as index's start at 0)
     */
    public void removeLastUser() {

        users.remove(users.size() - 1);
    }

    /**
     * remove users by username
     */
    void removeUser(String username) {

        users.removeIf(user -> user.getUsername().equals(username));

    }

    Iterator<User> getUserIterator() {

        return users.iterator();
    }


}
