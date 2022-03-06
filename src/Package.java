public class Package {
    private Address origin;
    private Address destination;
    private double weight;

    public Package(double weight, Address origin, Address destination){
        this.weight = weight;
        this.origin = origin;
        this.destination = destination;
    }

    public Address getOrigin(){
        return origin;
    }

    public Address getDestination(){
        return destination;
    }

    public double getWeight(){
        return weight;
    }
}
