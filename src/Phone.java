public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        // Default constructor
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String callerName) {
        System.out.println("Incoming call from " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Incoming call from " + callerName + " (" + callerNumber + ")");
    }

    public void sendMessage(String... numbers) {
        System.out.println("Sending message to the following numbers:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung Galaxy S20", 0.22);
        Phone phone2 = new Phone("012345678", "Xiaomi Redmi 6a", 0.21);
        Phone phone3 = new Phone("987654321", "Iphone XR" ,0.28);

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.number);
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight);

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.number);
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight);

        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.number);
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight);

        phone1.receiveCall("Oleksii Opanashchuk", "987654321");
        phone2.receiveCall("Oleksandr Volodko", "012345678");

        phone3.sendMessage("123456789", "012345678", "987654321");
    }
}