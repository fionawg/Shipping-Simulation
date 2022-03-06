public class PostageCalculator {
    public static double calculatePostage(String zipCode, String zipCode2, double weight){
        double cost = 3.75;
        cost += (weight / 0.1) * 0.05;
        double zipCodeStart = Integer.parseInt(zipCode.substring(0, 3));
        double zipCodeEnd = Integer.parseInt(zipCode2.substring(0, 3));
        double zipCodeCost = Math.abs(zipCodeStart - zipCodeEnd) / 100;
        cost += zipCodeCost;
        return cost;
    }

    public static double calculatePostage2(Address origin, Address destination, double weight){
        double cost = 3.75;
        cost = cost + ((weight / 0.1) * 0.05);
        double zipCodeStart = Integer.parseInt(origin.getZipCode().substring(0, 3));
        double zipCodeEnd = Integer.parseInt(destination.getZipCode().substring(0, 3));
        double zipCodeCost = Math.abs(zipCodeStart - zipCodeEnd) / 100;
        cost += zipCodeCost;
        return cost;
    }

    public static double calculatePostage3(Package item){
        double weight = item.getWeight();
        double cost = 3.75 + (weight / 0.1) * 0.05;
        double originZip = Integer.parseInt(item.getOrigin().getZipCode().substring(0, 3));
        double destinationZip = Integer.parseInt(item.getDestination().getZipCode().substring(0, 3));
        double zipCost = Math.abs(originZip - destinationZip) / 100;
        cost += zipCost;
        return cost;
    }
}
