package nio2_exercises;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex04 {
    public static void main(String[] args) {

        String nameFile = "hello";

        Path path1 = Path.of(nameFile);
        Path path2 = Paths.get(nameFile);

        URI uri = null;

        try {
            uri = new URI("file//" + nameFile);
            //if (uri.i)
            Path path3 = Path.of(uri);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }


    }

    public void createObjectsDifferentWays(File file){

    }
}
