package serializeDeserialize.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import serializeDeserialize.json.User;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        XmlMapper objectMapper = new XmlMapper();

        String fileName = "HometaskXML.xml";
        ClassLoader classLoader = Deserialization.class.getClassLoader();
        Path file = Paths.get(classLoader.getResource(fileName).getPath());

        Person person = objectMapper.readValue(file.toFile(), Person.class);
        System.out.println(person);
    }
}
