package identity;

import java.util.ArrayList;

public class Admin extends User{
    private int money = 0;
    private String role = "admin";

    public Admin(int userId, String username, String password, String role) {
        super(userId, username, password);
        this.role = "admin";
    }
}
