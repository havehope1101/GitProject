package fileIO;

import identity.Comic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

//public class WriteDataComic {
//    public static void writeDataToFile(String path, List<Comic> comics) {
//        String filePath = "C:\\Users\\Admin\\Desktop\\git codegym\\GitProject\\Module2\\case_study\\comic.txt";
//        Object newData = "New Data";
//
//        try {
//            FileOutputStream fos = new FileOutputStream(filePath, true);
//            ObjectOutputStream oos = new ObjectOutputStream(fos) {
//                protected void writeStreamHeader() throws IOException {}
//            };
//            List<Comic> comics = readDataFromFile(filePath);
//            comics.add(newData);
//
//            oos.writeObject(comics);
//            oos.close();
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}





public class WriteDataComic {
    public static void writeDataToFile(String path, List<Comic> comics) {
        String filePath = "C:\\Users\\Admin\\Desktop\\git codegym\\GitProject\\Module2\\case_study\\comic.txt";


        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(comics);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
