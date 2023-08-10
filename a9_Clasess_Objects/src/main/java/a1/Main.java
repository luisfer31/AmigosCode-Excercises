package a1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda", 5_100.0, EngineType.DIESEL);

        String manufacturer = car.getManufacturer();
        double price = car.getPrice();
        EngineType engineType = car.getEngineType();

        System.out.println("Car Details");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Engine Type: " + engineType);

        System.out.println();

        car.setManufacturer("Toyota");
        car.setPrice(20_000.0);
        car.setEngineType(EngineType.ELECTRIC);

        System.out.println("My car details after modification:");
        System.out.println("Manufacturer: " + car.getManufacturer());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Engine Type: " + car.getEngineType());

        System.out.println();

        CarDealership dealership = new CarDealership("XYZ auto", 5);

        dealership.addCarToStock(new Car("Toyota", 25000.0, EngineType.PETROL));
        dealership.addCarToStock(new Car("Tesla", 75000.0, EngineType.ELECTRIC));
        dealership.addCarToStock(new Car("Honda", 28000.0, EngineType.HYBRID));
        dealership.addCarToStock(new Car("Ford", 32000.0, EngineType.DIESEL));
        dealership.addCarToStock(new Car("Nissan", 22000.0, EngineType.PETROL));
        dealership.addCarToStock(new Car("Chevrolet", 30000.0, EngineType.HYBRID));

        System.out.println("\nCars currently in stock at " + dealership.getName() + ":");
        Car[] carsInStock = dealership.getCarsInStock();
        for (Car cars : carsInStock) {
            if (cars != null) {
                System.out.println(cars.getManufacturer() + " " + cars.getEngineType());
            }
        }

        System.out.println();

        CarDealership dealership1 = new CarDealership("XYZ1", 5);
        System.out.println("Car Dealer: " + dealership1.getName());
        System.out.println("Cars in stock: " + dealership1.getCarsInStockCount());
        dealership1.addCarToStock(new Car("Alfa", 52000.0, EngineType.HYBRID));
        System.out.println("Cars in stock: " + dealership1.getCarsInStockCount());

        System.out.println();
        System.out.println();

        CarDealership dealership2 = new CarDealership("XYZ2", 5);
        dealership2.addCarToStock(new Car("Toyota", 25000.0, EngineType.PETROL));
        dealership2.addCarToStock(new Car("Tesla", 75000.0, EngineType.ELECTRIC));
        dealership2.addCarToStock(new Car("Honda", 28000.0, EngineType.HYBRID));
        dealership2.addCarToStock(new Car("Toyota", 32000.0, EngineType.DIESEL));
        dealership2.addCarToStock(new Car("Nissan", 22000.0, EngineType.PETROL));

        String searchManufacturer = "Honda";
        Car foundCar = dealership2.findCarByManufacturer(searchManufacturer);
        if (foundCar != null) {
            System.out.println("Car found with manufacturer '" + searchManufacturer + "'" + ":");
            System.out.println(foundCar);
        } else {
            System.out.println("Car with manufacturer '" + searchManufacturer + "' not found in the dealership's stock.");
        }
    }
}
