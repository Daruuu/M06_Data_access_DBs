package nio2_intro;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Arrays;

public class Exer01_03 {
    public static void main(String[] args) {

        Exer01_03 exer0103 = new Exer01_03();
/*
        String namePath = "/src/testExersIntroNIO2";
        File directory = new File(namePath);
        // test 01
        exer0103.listFilesAndDirectories(directory);
        // test 01
        exer0103.listUnidadDiscosPc();
*/
        listarUnidadesDeDisco();
    }

    // ex01
    void listFilesAndDirectories(File directory) {
        if (directory.exists() && directory.isDirectory()) {
            for (File fd : directory.listFiles()) {
                System.out.println(fd.getName());
                if (fd.isDirectory())
                    listFilesAndDirectories(fd);
            }
        }
    }

    // ex02
    void listUnidadDiscosPc() {
        FileSystem fileSystem = FileSystems.getDefault();
        for (FileStore fileStore : fileSystem.getFileStores()) {
            System.out.println(fileStore.name());
            System.out.println(fileStore.type());
            try {
                System.out.println(fileStore.getTotalSpace());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("unidades de disco actual:\n %s", Arrays.toString(File.listRoots()));
    }

    // ex03
    public static void listarUnidadesDeDisco() {
        Iterable<Path> root = FileSystems.getDefault().getRootDirectories();
//        FileSystem root = (FileSystem) FileSystems.getDefault().getRootDirectories();
        for (Path raiz : root) {
            System.out.printf("unidad de disco: %s%n", root);
            try {
                FileStore store = raiz.getFileSystem().getFileStores().iterator().next();
                System.out.printf("tipo de sistema de archivo: %s%n", store.type());
                System.out.printf("espacio total de archivo: %s%n", store.getTotalSpace());
                System.out.printf("espacio sin usar: %d%n", store.getUsableSpace());

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
