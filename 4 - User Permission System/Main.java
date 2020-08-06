import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Create UserGroup named usergroup and add same data, call printUsernames
        UserGroup usergroup = new UserGroup();
        usergroup.addSampleData();
        System.out.println("People in user group");
        usergroup.printUsernames();

        // Create userGroup named administrators
        UserGroup administrators = new UserGroup();

        // Fetch an iterator for users
        Iterator<User> it = usergroup.getUserIterator();

        // Iterative loop to add all users who are administrators to the administrator usergroup
        while (it.hasNext()) {

            User user = it.next();

            if(user.getUserType().equals("admin")){

                administrators.add(user);

            }

        }

        // Print usernames in the administrator list
        System.out.println("People in admin group");
        administrators.printUsernames();

        //set final user in administrator list to user
        ArrayList<User> adminUsers = administrators.getUsers();
        User lastAdmin = adminUsers.get(adminUsers.size() -1);
        lastAdmin.setUserType();
        administrators.removeUser(lastAdmin.getUsername());

        System.out.println("People in admin group username3 is changed from admin to user");
        administrators.printUsernames();
        System.out.println("People in user group");
        usergroup.printUsernames();

    }
}
