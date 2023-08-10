package a4_car_garage;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(2);

        Car car1 = new Car("Toyota", "Corolla", 2021, "ABC123");
        Car car2 = new Car("Hoda", "Civic", 2022, "XYZ789");

        garage.addCar(car1);
        garage.addCar(car2);

        Car[] allCars = garage.getAllCars();
        for (Car car : allCars) {
            System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
        }

        System.out.println();

        CarService carService = new CarService();
        carService.repairCar(car1);
        carService.washCar(car2);

    }
}
