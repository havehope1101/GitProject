package identity;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private int userId;
    private String username;
    private String password;
    private ArrayList<String> borrowedComic;
    private int money;
    private String role = "normalUser";

    public User() {
    }

//    private int count = 2;

    public User( String username, String password, int money) {
        this.userId = userId++;
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public User(int userId, String username, String password, ArrayList<String> borrowedComic, int money, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.borrowedComic = borrowedComic;
        this.money = money;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<String> getBorrowedComic() {
        return borrowedComic;
    }

    public void setBorrowedComic(ArrayList<String> borrowedComic) {
        this.borrowedComic = borrowedComic;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", borrowedComic=" + borrowedComic +
                ", money=" + money +
                ", role='" + role + '\'' +
                '}';
    }
}
