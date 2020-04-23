package zhuangTaiDemo;

public abstract class AccountState {
    Account acc;
    static double balance;

    public abstract void stateCheck();

    public void deposit(double amount) {
        balance+=amount;
        System.out.println("现在余额为"+ balance);
        stateCheck();
    }

    public void withdraw(double amount) {
        balance-=amount;
        System.out.println("现在余额为"+ balance);
        stateCheck();
    }
}
