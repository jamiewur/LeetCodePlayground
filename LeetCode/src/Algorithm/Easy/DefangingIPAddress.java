package Algorithm.Easy;

public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("[.]","[.]");
    }
}
