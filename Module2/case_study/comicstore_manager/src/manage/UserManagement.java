package manage;

import checkData.CheckValidate;
import fileIO.ReadDataUser;
import fileIO.WriteDataComic;
import fileIO.WriteDataUser;
import identity.Admin;
import identity.Comic;
import identity.User;
import checkData.CheckInput;

import java.util.ArrayList;
import java.util.List;

import static fileIO.ReadDataUser.readDataUser;

public class UserManagement<T> {
   private List<User> users = new ArrayList<>();
   private ComicLibrary comicLibrary = new ComicLibrary();
   private WriteDataComic writeDataComic = new WriteDataComic();
    private WriteDataUser writeDataUser = new WriteDataUser();
    private ReadDataUser readDataUser = new ReadDataUser();

    // ----------------------THIS IS TEST CODE--------------------------------
        public UserManagement() {
            int userId2 =2;
            String username2 = "hahaha1";
            String password2= "hahaha1";
            ArrayList<String> arr2 = new ArrayList<>();
            arr2.add("Storm");
            int money2 = 5000;
            String role2 = "normalUser";
            User user2 = new User(userId2, username2, password2, arr2, money2, role2);
            users.add(user2);


            int userId1 =1;
            String username1 = "admin123";
            String password1 = "admin123";
            Admin user1 = new Admin(username1,password1, money2);
            users.add(user1);
        }
// ----------------------THIS IS TEST CODE--------------------------------


    public void addUser(User user) {
            users.add(user);
        writeDataUser.writeDataToFile("user.txt", users);
    }

    public void addUserByAdmin() {
        System.out.println("input username:");
        String username = CheckInput.getInputString();
        System.out.println("input password:");
        String password = CheckInput.getInputString();
        System.out.println("input money:");
        int money = CheckInput.checkInput();

        if(CheckValidate.validateInput(username, password)) {
            User user = new User(username, password, money);
            users.add(user);
            System.out.println("add user success");
            writeDataUser.writeDataToFile("user.txt", users);
        } else {
            System.out.println("username or password is invalid. Please try again");
        }
    }

    public void removeUser(int index) {
        users.remove(index);
    }

    public List<User> getAllUser() {
//        return this.users;
//        writeDataUser("user.txt",users);
        List<User> userDataFromFile = readDataUser("user.txt");
        return userDataFromFile;
    }

    public boolean authenticate(String username, String password) {
        for (User user:users) {
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return true;
            }
        }   return false;
    }

    public boolean checkRole(String username) {
        for (int i = 0; i < users.size(); i++) {
            if(username.equals(users.get(i).getUsername()) && users.get(i).getRole().equals("admin")) {
                return true;
            }
        }
        return false;
    }

    public void addComic() {
        System.out.println("input id:");
        int id = CheckInput.checkInput();
        System.out.println("input title");
        String title = CheckInput.getInputString();
        System.out.println("input author: ");
        String author = CheckInput.getInputString();
        System.out.println("input genre: ");
        ArrayList<String> arr = new ArrayList<>();
        {
            String genre;
            do {
                genre = CheckInput.getInputString();
                if(!genre.equals("")){
                arr.add(genre.toUpperCase());}
            } while (!genre.equals(""));
        }
        boolean availability = true;
        System.out.println("input value");
        int value = CheckInput.checkInput();

        Comic comic = new Comic(id, title, author, arr, availability, value);
        comicLibrary.add(comic);
        writeDataComic.writeDataToFile("comic.txt", comicLibrary.getAll());

        System.out.println("add comic success");
    }

    public List<Comic> getAll() {
            return comicLibrary.getAll();
    }
}
