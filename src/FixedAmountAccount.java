public class FixedAmountAccount extends AbstractAccount{
    public FixedAmountAccount(double balans) {
        super(balans);
    }

    @Override
    public void Put(double sumPut) {
        super.Put(sumPut);
    }

    @Override
    public void take(double sumTake) {
        throw new ArithmeticException("С данного аккаунта невозможно вывести деньги.");
    }

    @Override
    public double GetAmount() {
        return super.GetAmount();
    }
}
