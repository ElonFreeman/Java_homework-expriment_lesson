
class BankAccount {
    private String account;
    private double money;

   
    public BankAccount(String account, double money) {
        this.account = account;
        this.money = money;
    }

    
    public double deposit(double money) {
        this.money += money;
        return this.money;
    }


    public boolean withdraw(double money) {
        if (money > this.money) {
            return false; 
        } else {
            this.money -= money;
            return true; 
        }
    }

   
    public double queryBalance() {
        return this.money;
    }

    
    public String showAccount() {
        return this.account;
    }
}


public class Test {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("202609180930", 2000.00);
        BankAccount account2 = new BankAccount("202605661234", 3500.00);

    
        System.out.println("账号：" + account1.showAccount());
        System.out.println("初始余额：" + String.format("%.2f", account1.queryBalance()) + " 元");


        double balance1 = account1.deposit(500.00);
        System.out.println("存款 500.00 元成功，余额：" + String.format("%.2f", balance1) + " 元");


        boolean success1 = account1.withdraw(2000.00);
        if (success1) {
            System.out.println("取款 2000.00 元成功，余额：" + String.format("%.2f", account1.queryBalance()) + " 元");
        } else {
            System.out.println("取款 2000.00 元失败，余额不足");
        }


        boolean success2 = account1.withdraw(1000.00);
        if (success2) {
            System.out.println("取款 1000.00 元成功，余额：" + String.format("%.2f", account1.queryBalance()) + " 元");
        } else {
            System.out.println("取款 1000.00 元失败，余额不足");
        }


        double balance2 = account1.deposit(500.00);
        System.out.println("存款 500.00 元成功，余额：" + String.format("%.2f", balance2) + " 元");

        System.out.println("...");


        System.out.println("账号：" + account2.showAccount());
        System.out.println("初始余额：" + String.format("%.2f", account2.queryBalance()) + " 元");
        

        double b1 = account2.deposit(1500.50);
        System.out.println("存款 1500.50 元成功，余额：" + String.format("%.2f", b1) + " 元");

        boolean s1 = account2.withdraw(500.00);
        if (s1) {
            System.out.println("取款 500.00 元成功，余额：" + String.format("%.2f", account2.queryBalance()) + " 元");
        }
    }
}