package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome = LocalDate.now();

    public DepositAccount() {
    }

    @Override
    public void take(double amountToTake) {
        LocalDate now = LocalDate.now();
      if (lastIncome.plusMonths(1).isAfter(now)){
          return;
      } else if (amountToTake > amount) {
          System.out.println("Возникла ошибка");
      } else {
          amount -= amountToTake;
      }
    }
}
