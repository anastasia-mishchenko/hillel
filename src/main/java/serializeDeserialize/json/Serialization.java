package serializeDeserialize.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Serialization {
    public static void main(String[] args) throws IOException {

        User newUser = new User ();
        newUser.setName("Anna");
        newUser.setId(1111);
        newUser.setPermanent(false);
//        newUser.setPhoneNumbers(new ArrayList<Integer>(34343443)); что-то не могу понять как засетить тедефонные номера


        Address address = new Address();
        address.setCity("Lviv");
        address.setZipcode(111111);
        address.setStreet("Shevchenka");
        newUser.setAddress(address);



        ObjectMapper objectMapper = new ObjectMapper();

        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = workingFolder +separator+"src" + separator + "main" + separator + "resources";

        objectMapper.writeValue(new File(resourcesFolder+separator+"newUser.json"), newUser);

    }
}
