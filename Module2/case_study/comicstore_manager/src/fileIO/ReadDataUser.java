package fileIO;

import identity.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadDataUser {
    public static List<User> readDataUser(String path) {
        List<User> users = new ArrayList<>();
//        FileInputStream fis = null;
        try {
            FileInputStream   fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            users = (List<User>) ois.readObject();
//            users = (List<User>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
