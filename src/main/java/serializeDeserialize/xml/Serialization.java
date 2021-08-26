package serializeDeserialize.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Serialization {
    public static void main(String[] args) throws IOException {
    Person person1 = new Person();
    person1.setFirstName("Anna");
    person1.setLastName("Last");
    Address adress1 = new Address();
    adress1.setCity("Odessa");
    adress1.setStreetName("Shevchenka");
        Address adress2 = new Address();
        adress1.setCity("Lviv");
        adress1.setStreetName("Korolova");
//    person1.setAddress(adress1,adress2); и тут не могу понять как адреса добавить
  //  person1.setPhoneNumbers();    и телефоны

        XmlMapper objectMapper = new XmlMapper();
        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = workingFolder +separator+"src" + separator + "main" + separator + "resources";

        objectMapper.writeValue(new File(resourcesFolder+separator+"newPerson.xml"), person1);
    }
}
