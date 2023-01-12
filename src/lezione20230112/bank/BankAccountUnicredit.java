package lezione20230112.bank;

public class BankAccountUnicredit implements BankAccount{
  public static double annualInterest = 0.02;
  public static double feeDeposit = 1.00;
  public static double feeWithdraw = 1.00;
  String iban;
  double balance;

  public BankAccountUnicredit(String iban, double balance) {
    this.iban = iban;
    this.balance = balance;
  }

  @Override
  public String getIBAN() {
    return iban;
  }

  @Override
  public String getCountry() {
    return iban.substring(0,2);
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
    balance -= feeDeposit;
  }

  @Override
  public double withdraw(double amount) {
    balance -= amount;
    balance -= feeDeposit;
    return amount;
  }

  @Override
  public double transfer(BankAccount other, double amount) {
    withdraw(amount);
    other.deposit(amount);
    return amount;
  }

  @Override
  public double addAnnualInterest() {
    double interest = balance * annualInterest;
    balance += interest;
    return interest;
  }

  @Override
  public String toString() {
    return "BankAccountUnicredit{" +
            "iban='" + iban + '\'' +
            ", balance=" + balance +
            '}';
  }
}
