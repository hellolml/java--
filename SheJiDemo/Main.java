public class Main {
    public static void main(String args[]){
            Factory factory = new Factory();
            Phone huaWei = factory.creatPhone("HuaWei");
            Phone xiaomi = factory.creatPhone("XiaoMi");
            huaWei.prin();
            xiaomi.prin();
    }
}
