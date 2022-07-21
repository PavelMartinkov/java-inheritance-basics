package practice;

public class BankAccount {

  public double amount;

  public BankAccount() {
  }

  public BankAccount(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut < amount) {
      System.out.println("Сумма на счете: " + amount);
    } else {
      amount += amountToPut;
      System.out.println("Сумма на счете: " + amount);
    }
  }

  public void take(double amountToTake) {
    if (amountToTake > getAmount()) {
      amount -= 0.0;
      System.out.println("Недостаточно средств, доступная сумма: " + amount);
    } else {
      amount -= amountToTake;
      System.out.println("Остаток на счете: " + amount);
    }
  }
}
