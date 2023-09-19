package ex01;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Arrays;

public class ex01 {

    public static void main(String[] args) {
        String nameFile;
        nameFile = "Dam_M06/src";
        File    file;
        file = new File(nameFile);

    }

    public void listFiles(File file)
    {
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());

        if (file.exists() && file.isDirectory())
        {
            for(File f : file.listFiles())
            {
                System.out.println(f.getName());
                if (f.isDirectory())
                    listFiles(f);

            }
        }
    }


    //ex 03
    public void listUnidadDeDisco()
    {
        System.out.println("unidades de disco:");
        System.out.println(Arrays.toString(File.listRoots()));
    }
    public void listUnidadDeDiscosSD()
    {
        FileSystem fileSystem = FileSystems.getDefault();
        for (FileStore fileStore: fileSystem.getFileStores())
        {
            System.out.println(fileStore.name());
            System.out.println(fileStore.type());
            try {
                System.out.println(fileStore.getTotalSpace());
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // ex 04


}
