import java.util.*;
class Customer {
    String name;
    double balance;
    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }
    void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}
class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>();
    Bank(String bankName) {
        this.bankName = bankName;
    }
    void openAccount(Customer c, double initialDeposit) {
        customers.add(c);
        c.balance += initialDeposit;
        System.out.println(c.name + " opened an account with $" + initialDeposit + " at " + bankName);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        bank.openAccount(c1, 1000);
        bank.openAccount(c2, 2000);
        c1.viewBalance();
        c2.viewBalance();
    }
}
