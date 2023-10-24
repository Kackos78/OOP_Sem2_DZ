// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DepositAccount deposit = new DepositAccount(100000.0);
        //deposit.take(100.0);
        deposit.GetAmount();
        System.out.println();
        CreditAccount creditAccount = new CreditAccount(9000.0);
        creditAccount.take(100.0);

        FixedAmountAccount fixedAmountAccount = new FixedAmountAccount(1000);
        fixedAmountAccount.take(100);
    }
}