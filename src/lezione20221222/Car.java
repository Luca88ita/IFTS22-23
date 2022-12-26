package lezione20221222;

//import java.util.List;
import java.util.Objects;

public class Car {
  String brand;
  String model;
  Double cc;
  String plateNumber;

  public void setBrand(String brand) throws IllegalAccessException {
    if (brand.equals("Porsche")){
      throw new IllegalAccessException();
    }
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setCc(Double cc) {
    this.cc = cc;
  }
  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public Double getCc() {
    return cc;
  }
  public String getPlateNumber() {
    return plateNumber;
  }


  /**
   * Questo è il costruttore della classe Car, che richiede 4 variabili
   * @param brand
   * @param model
   * @param cc
   * @param plateNumber
   */
  public Car(String brand, String model, Double cc, String plateNumber) {
    this.brand = brand;
    this.model = model;
    this.cc = cc;
    this.plateNumber = plateNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Car car = (Car) o;

    if (!Objects.equals(brand, car.brand)) return false;
    if (!Objects.equals(model, car.model)) return false;
    if (!Objects.equals(cc, car.cc)) return false;
    return Objects.equals(plateNumber, car.plateNumber);
  }

  @Override
  public int hashCode() {
    int result = brand != null ? brand.hashCode() : 0;
    result = 31 * result + (model != null ? model.hashCode() : 0);
    result = 31 * result + (cc != null ? cc.hashCode() : 0);
    result = 31 * result + (plateNumber != null ? plateNumber.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() { // è buona norma creare l metodo toString
    return "Car{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", cc=" + cc + '\'' +
            ", plateNumber=" + plateNumber +
            '}';
  }
}
