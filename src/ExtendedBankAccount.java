public class ExtendedBankAccount extends BankAccount {
    private String currency;    // Валюта рахунку
    private double interestRate;    // Процентна ставка

    // Конструктор класу
    public ExtendedBankAccount(String name, String accountNumber, double balance, String currency, double interestRate) {
        super(name, accountNumber, balance);
        this.currency = currency;
        this.interestRate = interestRate;
    }

    // Перевизначена функція для виводу даних про рахунок з урахуванням нових полів
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Валюта рахунку: " + currency);
        System.out.println("Процентна ставка: " + interestRate);
    }

    public static void main(String[] args) {
        ExtendedBankAccount account = new ExtendedBankAccount("Олексій Опанащук", "123456789", 1000.0, "USD", 0.05);

        account.displayAccountInfo();    // Виводимо дані про рахунок з урахуванням нових полів
    }
}
