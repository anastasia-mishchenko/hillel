package serializeDeserialize.xml;

import java.io.Serializable;

public class Address implements Serializable {
    private String streetName;
    private String city;

    public String getStreetName() { return streetName; }
    public void setStreetName(String value) { this.streetName = value; }

    public String getCity() { return city; }
    public void setCity(String value) { this.city = value; }



    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
