package Home;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Utility {
    static void saveGame(String path, GameProgress prog) {

        File file = new File(path);
        try {
            if (file.createNewFile())
                System.out.println("Файл " + file.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(prog);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void zipFiles(String zip, File[] files) {
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zip))) {
            for (File file : files) {
                FileInputStream fils = new FileInputStream(file);
                ZipEntry entry = new ZipEntry(file.getName());
                zout.putNextEntry(entry);
                byte[] buffer = new byte[fils.available()];
                fils.read(buffer);
                zout.write(buffer);
                zout.closeEntry();
                fils.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void del(String path) {
        try {
            File file = new File(path);
            if (file.delete()) {
                System.out.println("файл " + file.getName() + " удалён.");
            } else {
                System.out.println("файл " + file.getName() + " не может быть удалён.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

