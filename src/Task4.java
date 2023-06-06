abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void brake();

    public void gas() {
        System.out.println("Газуємо!");
    }
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Седан гальмує.");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Вантажівка гальмує.");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Audi A6", "Black", 220);
        Truck truck = new Truck("Iveco Daily", "Gray", 160);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }
}