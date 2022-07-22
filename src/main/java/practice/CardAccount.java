package practice;

public class CardAccount extends BankAccount {

    private final double COMMISSION = 0.01;

    public CardAccount() {
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
        if (amountToTake <= amount || amountToTake >= 100.0) {
            amount -= amountToTake * COMMISSION;
        }
            else {
            System.out.println("Возникла ошибка");
            }
        }
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);

