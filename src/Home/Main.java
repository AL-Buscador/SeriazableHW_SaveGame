package Home;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path1 = "D:\\РњРѕРё РґРѕРєСѓРјРµРЅС‚С‹\\Java Files\\JavaHW\\Games\\savegames\\save1.dat";
        String path2 = "D:\\РњРѕРё РґРѕРєСѓРјРµРЅС‚С‹\\Java Files\\JavaHW\\Games\\savegames\\save2.dat";
        String path3 = "D:\\РњРѕРё РґРѕРєСѓРјРµРЅС‚С‹\\Java Files\\JavaHW\\Games\\savegames\\save3.dat";

        String zip = "D:\\РњРѕРё РґРѕРєСѓРјРµРЅС‚С‹\\Java Files\\JavaHW\\Games\\savegames\\savedFiles.zip";

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
