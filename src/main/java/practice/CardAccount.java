package practice;

public class CardAccount extends BankAccount {

    public double commission = 0.01;

    public CardAccount() {
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
        if (amountToTake <= amount || amountToTake >= 100.0) {
            amount -= amountToTake * commission;
        }
            else {
                amount -= 0.0;
            }
        }
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);

