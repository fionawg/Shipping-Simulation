public class Address {
    private String street;
    private String name;
    private String apartmentNum; //optional
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String name, String apartmentNum, String city, String state, String zipCode){
        this.street = street;
        this.name = name;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(Address x){
        street = x.getStreet();
        name = x.getName();
        apartmentNum = x.getApartmentNum();
        city = x.getCity();
        state = x.getState();
        zipCode = x.getZipCode();
    }

    public Address(String address){
        String[] split = address.split(",");
        city = split[1].substring(1);
        state = split[2].substring(1, 3);
        zipCode = split[2].substring(4);
        String firstPart = split[0];
        int count = firstPart.indexOf(" ");
        street = firstPart.substring(0, count);
        String firstPartLower = firstPart.toLowerCase();
        if (firstPartLower.contains("apt")) {
            int count2 = firstPartLower.indexOf("apt");
            apartmentNum = firstPart.substring(count2);
            name = firstPart.substring(count + 1, count2 - 1);
        }
        else{
            name = firstPart.substring(count + 1);
        }
    }

    public String getStreet(){
        return street;
    }

    public String getName(){
        return name;
    }

    public String getApartmentNum(){
        return apartmentNum;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZipCode(){
        return zipCode;
    }

    public String toString(){
        if (apartmentNum != null){
            return street + " " + name + " " + apartmentNum + ", " + city + ", " + state + " " + zipCode;
        }
        return street + " " + name + ", " + city + ", " + state + " " + zipCode;
    }
}
