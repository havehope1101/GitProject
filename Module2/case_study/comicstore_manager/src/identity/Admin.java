package identity;

import java.util.ArrayList;

public class Admin extends User{
    private String role = "admin";
//    private String username;
//    private String password;

    public Admin(String username, String password, int money) {
        super(username, password, money);
        this.role = "admin";
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" +"username='" + super.getUsername() +'\''  +
                ", password='" + super.getUsername() +'\''  +
                ", role='" + role + '\'' +
                '}';
    }
}
