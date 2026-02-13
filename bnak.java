class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    String accountNumber;
    String name;
    double balance;

    Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    void transfer(Account target, double amount) throws InsufficientFundsException {
        withdraw(amount);
        target.deposit(amount);
        System.out.println("Transferred: " + amount);
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class bnak {
    public static void main(String[] args) {

        Account a1 = new Account("101", "Mishti", 5000);
        Account a2 = new Account("102", "Rahul", 3000);

        try {
            a1.deposit(1000);
            a1.withdraw(2000);
            a1.transfer(a2, 1500);
            a1.withdraw(10000); 
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        a1.display();
        a2.display();
    }
}
