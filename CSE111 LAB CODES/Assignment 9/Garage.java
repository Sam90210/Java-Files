public class Garage {
    public Car[] cars;
    public Bike[] bikes;

    private int carCount;
    private int bikeCount;

    public Garage(int carCapacity, int bikeCapacity) {
        cars = new Car[carCapacity];
        bikes = new Bike[bikeCapacity];

        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + carCapacity);
        System.out.println("Bike Capacity: " + bikeCapacity);
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            if (carCount < cars.length) {
                cars[carCount++] = (Car) vehicle;
                System.out.println("A " + vehicle.getBrand()
                        + " CAR has been added to the Garage");
            } else {
                System.out.println("Can't add more Cars! Capacity: " + cars.length);
            }
        } else if (vehicle instanceof Bike) {
            if (bikeCount < bikes.length) {
                bikes[bikeCount++] = (Bike) vehicle;
                System.out.println("A " + vehicle.getBrand()
                        + " BIKE has been added to the Garage");
            } else {
                System.out.println("Can't add more bikes! Capacity: " + bikes.length);
            }
        }
    }
}

