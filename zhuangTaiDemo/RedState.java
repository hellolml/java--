package zhuangTaiDemo;

public class RedState extends AccountState {

    public RedState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void stateCheck() {
        if (balance>=0){
            acc.setState(new GreenState(this));
        }else if(balance<0&&balance>=-1000){
            acc.setState(new YellowState(this));
        }
    }

    public void withdraw(double amount){
        balance-=amount;
        System.out.println("账户被冻结,取款失败");
        System.out.println("现在余额为"+balance);
    }
}
