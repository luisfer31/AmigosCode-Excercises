package a1;

public class Car {
    private String manufacturer;
    private double price;
    private EngineType engineType;

//    public enum a1.EngineType {
//        PETROL, ELECTRIC, DIESEL, HYBRID
//    }

    public Car(String manufacturer, double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }

}
