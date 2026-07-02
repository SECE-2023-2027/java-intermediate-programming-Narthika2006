package problem_5;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new MotorCycle()
        };

        for (Vehicle vehicle : vehicles) {
           vehicle.startEngine();
        }
    }
}
