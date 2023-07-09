package fileIO;

import identity.User;

import java.io.*;
import java.util.List;

    public class WriteDataUser {
        public static void writeDataToFile(String path, List<User> users) {
            try {
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(users);
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


//public class WriteDataUser {
//    public static void writeDataToFile(String path, List<User> users) {
//
//        try {
//            FileOutputStream fos = new FileOutputStream(path, true);
//            ObjectOutputStream oos = new ObjectOutputStream(fos) {
//                protected void writeStreamHeader() throws IOException {
//                    reset();
//                }
//            };
//            oos.writeObject(users);
//
//            oos.close();
//            fos.close();
//
//            System.out.println("success");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("error" + e.getMessage());
//        }
//    }
//}



