public class Address {
    private String street;
    private String name;
    private String apartmentNum; //optional
    private String city;
    private String state;
    private int zipCode;

    public Address(String street, String name, String apartmentNum,String city, String state, int zipCode){
        this.street = street;
        this.name = name;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(Address x){
        street = x.street;
        name = x.name;
        apartmentNum = x.apartmentNum;
        city = x.city;
        state = x.state;
        zipCode = x.zipCode;
    }

    public Address(String address){

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

    public int getZipCode(){
        return zipCode;
    }

    public boolean compare(Address address){
        if (!address.getStreet().equals(street)){
            return false;
        }
        if (!address.getName().equals(name)){
            return false;
        }
        if (!address.getApartmentNum().equals(apartmentNum)){
            return false;
        }
        if (!address.getCity().equals(city)){
            return false;
        }
        if (!address.getState().equals(state)){
            return false;
        }
        if (!(address.getZipCode() == zipCode)){
            return false;
        }
        return true;
    }

    public String toString(){
        return street + " " + name + apartmentNum + ", " + city + ", " + state + " " + zipCode;
    }
}
