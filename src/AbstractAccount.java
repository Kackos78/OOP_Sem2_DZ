abstract class AbstractAccount implements Account {
    protected double balans;

    public AbstractAccount (double balans) {this.balans = balans;}

    @Override
    public void Put(double sumPut) {
        if (sumPut > 0.0) {
            this.balans += sumPut;
            System.out.println("Операция проведена успешно.");
            System.out.println("Текущий баланс = " + this.GetAmount());
        } else {throw new ArithmeticException("Ошибка пополнения счета, операция отменена."); }
    }

    @Override
    public void take(double sumTake) {
        if (sumTake > 0.0 && sumTake < this.balans) {
            this.balans -= sumTake;
            System.out.println("Операция проведена успешно.");
            System.out.println("Текущий баланс = " + this.GetAmount());
        } else {throw new ArithmeticException("Ошибка вывода средств, операция отменена."); }
    }

    @Override
    public double GetAmount() {return this.balans;}
}

