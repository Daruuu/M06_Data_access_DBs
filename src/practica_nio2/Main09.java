package practica_nio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main09 {
    public static void main(String[] args) {
        String nameFile = "test/ex09.txt";
        Path path = Path.of(nameFile);

        String namePathPares = "test/lineas_pares_ex09.txt";
        Path pathPares = Path.of(namePathPares);

        String namePathImpares = "test/lineas_impares_ex09.txt";
        Path pathImpares = Path.of(namePathImpares);
    }

    void readFileWithBuffReader(Path path, Path pathPares, Path pathImpares) {
        try (BufferedReader reader = Files.newBufferedReader(path);
             BufferedWriter writerPares = Files.newBufferedWriter(pathPares);
             BufferedWriter writerImpares = Files.newBufferedWriter(pathImpares);
        ) {
            String lines = reader.readLine();
            int numLinea = 1;

            while (lines != null) {
                if (numLinea % 2 == 0) {
                    writerPares.write(lines);
                    writerPares.newLine();
                } else {
                    writerImpares.write(lines);
                    writerImpares.newLine();
                }
                System.out.println(lines);
                lines = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
