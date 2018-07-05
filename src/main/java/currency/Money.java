package currency;

public class Money {

    int amount;
    String currency;

    public Money() {}

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar createDollar(int amount) {
        return new Dollar(amount);
    }

    static Franc createFranc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return (this.amount == money.amount)
                && (this.currency.equals(money.currency));
    }
}
