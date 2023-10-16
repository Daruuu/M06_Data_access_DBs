package nio2intro;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Arrays;

public class Exer01_03 {
    public static void main(String[] args) {

        Exer01_03 exer0103 = new Exer01_03();
        String namePath = "src/testExers";
        File directory = new File(namePath);
        // test 01
        exer0103.listFilesAndDirectories(directory);
        // test 01
        exer0103.listUnidadDiscosPc();
    }

    // ex01
    void listFilesAndDirectories(File directory)
    {
        if (directory.exists() && directory.isDirectory())
        {
            for (File fd : directory.listFiles())
            {
                System.out.println(fd.getName());
                if (fd.isDirectory())
                    //call my function recursive
                    listFilesAndDirectories(fd);
            }
        }
    }

    // ex02
    void listUnidadDiscosPc()
    {
        FileSystem fileSystem = FileSystems.getDefault();
        for (FileStore fileStore : fileSystem.getFileStores())
        {
            System.out.println(fileStore.name());
            System.out.println(fileStore.type());
            try
            {
                System.out.println(fileStore.getTotalSpace());
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        System.out.printf("unidades de disco actual:\n %s", Arrays.toString(File.listRoots()));
    }
}
