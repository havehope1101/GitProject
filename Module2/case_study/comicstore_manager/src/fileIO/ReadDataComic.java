package fileIO;

import identity.Comic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadDataComic {

        public static List<Comic> readDataComic(String path) {
            List<Comic> comics = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                comics = (List<Comic>) ois.readObject();
                fis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return comics;
        }

    }

