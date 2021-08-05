package filesComparable.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {



        try {
            Files.createDirectory(Paths.get("src/files"));

            File file = new File("src/test.properties");
            Properties properties = new Properties();
            properties.load(new FileReader(file));

            String fileName = properties.getProperty("fileName");

            Files.createFile(Path.of("src/" + fileName + ".txt"));



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
