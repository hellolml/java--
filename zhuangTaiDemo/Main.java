package zhuangTaiDemo;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("段誉",5.0);
        account.deposit(100);
        account.withdraw(200);
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(100);
    }
}
