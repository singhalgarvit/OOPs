package bank_management_system;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Customer customer1 = new Customer("Garvit Singhal", 1, 202501, 1000);
        Customer customer2 = new Customer("Divanshu Jain", 2, 202502, 10000);
        Customer customer3 = new Customer("Yatharth Bajaj", 3, 202503, 300);
        Customer customer4 = new Customer("Sagar Goyal", 4, 202504, 9999);
        Customer customer5 = new Customer("Ankit Jagetia", 5, 202505, 100023);
        customer1.withdraw(1, 202501, 100);
        System.out.println(customer1.showBalance(1,202501));
    }
}
