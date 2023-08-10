package a4_car_garage;

public class Car {
    private String make;
    private String model;
    private int year;
    private String licensePlate;

    public Car(String make, String model, int year, String licensePlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
