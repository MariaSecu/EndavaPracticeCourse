package vehicle;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + super.toString().substring(9, super.toString().length() - 1) + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }


}
