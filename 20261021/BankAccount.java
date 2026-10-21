public class BankAccount {
    static class bankaccount {
    
        String account;
        double money;

        bankaccount(String account,double money)
        {
            this.money=money;
            this.account=account;
        }

        double deposit(double money)
        {
            this.money-=money;
            return this.money;
        }

        boolean withdraw(double money)
        {
            if(money>0)return true;
            else return false;
        }

        double querybalance()
        {
            return money;
        }

        String showaccount()
        {
            return account;
        }
    }

    public static void main(String[] args) {
        
        bankaccount[] arr = new bankaccount[4];
        for(int i=0;i<4;i++)
        {
            arr[i] = new bankaccount("123456789", i*1000);
        }

        
    }
}
