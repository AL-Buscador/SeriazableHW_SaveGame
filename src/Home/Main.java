package Home;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\Мои документы\\Java Files\\JavaHW\\Games\\savegames";
        String path1 = path + "\\save1.dat";
        String path2 = path + "\\save2.dat";
        String path3 = path + "\\save3.dat";

        String zip = path + "\\savedFiles.zip";

        GameProgress progress1 = new GameProgress(5, 3, 6, 6.5);
        GameProgress progress2 = new GameProgress(4, 7, 2, 2.3);
        GameProgress progress3 = new GameProgress(7, 9, 4, 19.1);

        File[] files = new File[]{new File(path1), new File(path2), new File(path3)};

        Utility.saveGame(path1, progress1);
        Utility.saveGame(path2, progress2);
        Utility.saveGame(path3, progress3);

        Utility.zipFiles(zip, files);

        Utility.del(path1);
        Utility.del(path2);
        Utility.del(path3);
    }
}