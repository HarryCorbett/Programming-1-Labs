public class User {

    private String username;
    private String userType;
    private String name;

    User(String username, String userType, String name) {
        this.username = username;
        this.userType = userType;
        this.name = name;
    }

    String getUsername() {
        return username;
    }

    String getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    void setUserType() {

        this.userType = "user";
    }
}
