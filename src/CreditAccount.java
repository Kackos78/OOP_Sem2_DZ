public class CreditAccount extends AbstractAccount {
    public CreditAccount(double balans) {
        super(balans);
    }

    @Override
    public void Put(double sumPut) {
        super.Put(sumPut);
    }

    @Override
    public void take(double sumTake) {
        if (sumTake > 0 && sumTake < balans){
            balans = balans - sumTake - (sumTake / 100);
            System.out.println("Операция проведена успешно.");
            System.out.println("Комиссия составила = " + sumTake / 100);
            System.out.println("Текущий баланс = " + GetAmount());}
        else {throw new ArithmeticException("Ошибка вывода средств, операция отменена.");}
    }

    @Override
    public double GetAmount() {
        return super.GetAmount();
    }
}


