package QiaoJieDemo;

public class UnixVersion extends OperatingSystemVersion {
    @Override
    public void paly(String fileName) {
        String osType = "Unix";
        this.vf.decode(osType,fileName);
    }
}
