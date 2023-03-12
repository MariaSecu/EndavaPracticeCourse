package vehicle;

public class ExecutionVehicle {

    public static void main(String[] args) {
        Vehicle bicycle = new Vehicle("Bulgaria");
        System.out.println(bicycle.toString());

        Car dacia = new Car("Romania", 5);
        System.out.println(dacia.toString());

    }
}
