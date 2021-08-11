package filesComparable.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {



        try {
            Files.createDirectory(Paths.get("src/files"));

            File file = new File("src/test.properties");
            Properties properties = new Properties();
            properties.load(new FileReader(file));

            String fileName = properties.getProperty("fileName");

            String FILE = "src/" + fileName + ".txt";

            Path path = Paths.get(FILE);

            Files.writeString(path, "My name is Nastia");

            Path path1 = Path.of("src/files/files");

            Files.move(path,path1);

            List<String> list = Files.readAllLines(path1);
            for (String item: list) {
                System.out.println(item);
                
            }








        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
