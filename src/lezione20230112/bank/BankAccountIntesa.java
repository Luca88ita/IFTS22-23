package lezione20230112.bank;

public class BankAccountIntesa implements BankAccount{
  public static double AnnualInterest = 0.02;
  public static double feeDeposit = 1.00;
  public static double feeWithdraw = 1.00;
  String iban;
  double balance;

  public BankAccountIntesa(String iban, double balance) {
    this.iban = iban;
    this.balance = balance;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
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
  }

  @Override
  public double withdraw(double amount) {
    double w = Math.min(balance,amount);
    balance -= w;
    return w;
  }

  @Override
  public double transfer(BankAccount other, double amount) {
    double w = 0;
    if (getCountry().equals(other.getCountry())){
      w = withdraw(amount);
      other.deposit(w);
    }
    return w;
  }

  @Override
  public double addAnnualInterest() {
    return 0.0;
  }

  @Override
  public String toString() {
    return "BankAccountIntesa{" +
            "iban='" + iban + '\'' +
            ", balance=" + balance +
            '}';
  }
}
