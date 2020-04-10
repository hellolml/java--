public class Factory {
    public Phone creatPhone(String name){
        if("HuaWei".equals(name)){
            return new HuaWei();
        }else if("XiaoMi".equals(name)){
            return new XiaoMi();
        }else {
            return null;
        }
    }
}
