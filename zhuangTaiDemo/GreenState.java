package zhuangTaiDemo;

public class GreenState extends AccountState{
    public GreenState(double init,Account acc) {
        balance = init;
        this.acc = acc;
        acc.setState(new GreenState(this));
    }

    public GreenState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void stateCheck() {
        if (balance>=0){
            acc.setState(new GreenState(this));
        }else if(balance<0&&balance>=-1000){
            acc.setState(new YellowState(this));
        }else if(balance<-1000){
            acc.setState(new RedState(this));
        }
    }

}
