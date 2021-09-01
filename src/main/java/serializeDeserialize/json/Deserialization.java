package serializeDeserialize.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String fileName = "example1.json";
        ClassLoader classLoader = Deserialization.class.getClassLoader();
        Path file = Paths.get(classLoader.getResource(fileName).getPath());

        User user = objectMapper.readValue(file.toFile(), User.class);
        System.out.println(user);




    }
}