package strategy;

public class Client {
    public static void main(String[] args) {
      GoogleMaps googleMaps = new GoogleMaps();
      String path = googleMaps.findPath("Hyderabad", "Chennai",Modes.CAR);
        System.out.println(path);
    }
}
