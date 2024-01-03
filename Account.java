public class Account {
    int balance;

    public Account() {
        this.balance = 0;
    }

    public Account(int initialbalance, int Depositamount) {
        balance = initialbalance;
        {
            if (Depositamount > 0) {
                balance += Depositamount;
                System.out.println("Current balance after deposit is : " + balance);
            } else
                System.out.println("Invalid deposit, current balace :" + balance);

        }

    }

    public void withdrawl(int withdrawlamount) {
        if (withdrawlamount > 0 & withdrawlamount <= balance) {
            balance -= withdrawlamount;
            System.out.println("Current balance after withdrawl is : " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }


        public static void main (String[]args){
        Account a = new Account();
        a.withdrawl(50);
        a = new Account(500, 100);

    }



}




