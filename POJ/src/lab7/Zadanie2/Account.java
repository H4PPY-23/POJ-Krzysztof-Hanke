//package lab7.Zadanie2;
//
//public class Account {
//    private String accountName;
//    private double balance;
//
//    public Account(String accountName, double initialBalance) {
//        this.accountName = accountName;
//        this.balance = initialBalance;
//    }
//
//    public void withdraw(double amount) throws InsufficientFundsException {
//        if (amount > balance) {
//            throw new InsufficientFundsException("Niewystarczające środki na koncie!");
//        }
//        balance -= amount;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}
