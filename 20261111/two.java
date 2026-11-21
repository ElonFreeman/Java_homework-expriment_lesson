public class TestParameter {

    static void changeNumber(double money) {
        money = 1000.0;
    }

    static void changeAccount(Account account) {
        account.balance = 1000.0;
    }

    public static void main(String[] args) {
        double money = 500.0;
        Account myAccount = new Account();
        myAccount.balance = 500.0;

        System.out.println("Before calling:");
        System.out.println("money: " + money);
        System.out.println("balance: " + myAccount.balance);

        changeNumber(money);
        changeAccount(myAccount);

        System.out.println("After calling:");
        System.out.println("money: " + money);
        System.out.println("balance: " + myAccount.balance);
    }
}

class Account {
    public double balance;
}
