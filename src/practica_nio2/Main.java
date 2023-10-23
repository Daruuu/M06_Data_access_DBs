package practica_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String namePath = "test";
        Path path = Path.of(namePath);

        System.out.println(Files.exists(path));
        try {
            Path absolutPath = path.toRealPath();
            System.out.println("el path " + absolutPath + " existe");
//            path.toRealPath(path);
/*
        } catch (NoSuchFieldException e) {
            System.out.println("el path " + path.getFileName() + " no existe.");
*/
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
