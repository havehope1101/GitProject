package manage;

import identity.Comic;
import identity.User;

import java.util.ArrayList;
import java.util.List;

public class UserManagement<T> {
    List<User> users = new ArrayList<>();

        public UserManagement() {
            int userId1 =1;
            String username1 = "hahaha1";
            String password1 = "hahaha1";
            ArrayList<String> arr1 = new ArrayList<>();
            arr1.add("Storm");
            int money1 = 5000;
            String role1 = "normalUser";
            User user1 = new User(userId1, username1, password1, arr1, money1, role1);
            users.add(user1);
        }


}
