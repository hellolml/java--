package QiaoJieDemo;

public class WindowsVersion extends OperatingSystemVersion{

    @Override
    public void paly(String fileName) {
        String osType = "Windows";
        this.vf.decode(osType,fileName);
    }
}
