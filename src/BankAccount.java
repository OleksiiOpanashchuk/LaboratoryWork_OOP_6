public class BankAccount {
    private String name;    // Ім'я власника рахунку
    private String accountNumber;    // Номер рахунку
    private double balance;    // Сальдо рахунку

    // Конструктор класу
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Функція для покладання суми на рахунок
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Покладено " + amount + " на рахунок.");
    }

    // Функція для зняття суми з рахунку
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Знято " + amount + " з рахунку.");
        } else {
            System.out.println("Недостатньо коштів на рахунку.");
        }
    }

    // Функція для виводу даних про рахунок
    public void displayAccountInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Сальдо: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Олексій Опанащук", "123456789", 10000.0);

        account.displayAccountInfo();    // Виводимо початкові дані про рахунок

        account.deposit(500.0);    // Покладаємо 500 на рахунок
        account.withdraw(200.0);    // Знімаємо 200 з рахунку

        account.displayAccountInfo();    // Виводимо оновлені дані про рахунок
    }
}
