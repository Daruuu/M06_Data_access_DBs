package practica_nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MainFiles04 {
    public static void main(String[] args) {
//        String namePath = "/test/hola.txt";
        String namePath = "directorio";

        Path path = Path.of(namePath);

        if (!Files.isDirectory(path)) {
            Path copyPath = path.toAbsolutePath().getParent().getParent().resolve(path.getFileName());
            System.out.println(copyPath);

            try {
                Files.copy(path, copyPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
        }
    }

    void ex(String namepath) {
        Path path = Path.of(namepath);
        try {
            Files.copy(path, System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    void deleteFilesEx08(String pathname, File file) {

        if (!pathname.isEmpty())
            file = new File(pathname);
        Path path = Path.of(namepath);
        try {
            Files.copy(path, System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/
}






