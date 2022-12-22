package lezione20221222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Applicazione2 {
  public static Car findCarByPlate(List<Car> cars, String licencePlate){
    for (Car car : cars){
      if (car.getPlateNumber().equals(licencePlate)){
        return car;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("Fiat", "Punto",1800.0, "AA333GG"));
    cars.add(new Car("Lotus", "Elise", 1700.0,"AA444GG"));
    cars.add(new Car("VW", "Golf R", 1800.0,"AA555GG"));
    cars.add(new Car("Fiat", "Punto HGT", 1800.0,"AA333TT"));
    System.out.println(findCarByPlate(cars,"AA333GG"));
    /*--------------------------------*/
    Map<String ,Car> map = new HashMap<>();
    map.put("AA333GG", new Car("Fiat", "Punto",1800.0, "AA333GG"));
    map.put("AA444GG", new Car("Lotus", "Elise", 1700.0,"AA444GG"));
    map.put("AA555GG", new Car("VW", "Golf R", 1800.0,"AA555GG"));
    map.put("AA333TT", new Car("Fiat", "Punto HGT", 1800.0,"AA333TT"));
    System.out.println(map.get("AA333TT"));
  }
}
