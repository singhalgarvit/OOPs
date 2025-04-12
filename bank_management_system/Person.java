package bank_management_system;

public class Person {
    protected String Name;
    protected int Id;
}

class Customer extends Person {
    private int AccountNo;
    private int Balance;

    public Customer(String Name, int Id, int AccountNo, int Balance) { // This is constructor
        this.Name = Name;
        this.Id = Id;
        this.AccountNo = AccountNo;
        this.Balance = Balance;
    }

    public String showBalance(int Id, int AccountNo) { // Method to show balance
        if (this.Id == Id && this.AccountNo == AccountNo) {
            return "Your Current Balance is " + Balance;
        } else {
            return "Kindly Enter Correct Id or Account Number.";
        }
    }

    public String withdraw(int Id, int AccountNo, int amount) { // Method to withdraw amount
        if (this.Id == Id && this.AccountNo == AccountNo) {
            if (amount <= Balance) {
                Balance = Balance - amount;
                return "Successfully Withdrawn";
            } else {
                return "Insufficient Amount";
            }
        } else {
            return "Kindly Enter Correct Id or Account Number.";
        }

    }

    public String deposit(int Id, int AccountNo, int amount) {      //Method to deposit amount
        if (this.Id == Id && this.AccountNo == AccountNo) {
            if (amount > 0) {
                Balance = Balance + amount;
                return "Successfully Deposit";
            } else {
                return "Enter valid amount";
            }
        } else {
            return "Kindly Enter Correct Id or Account Number.";
        }

    }
}
