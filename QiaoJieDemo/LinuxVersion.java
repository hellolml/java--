package QiaoJieDemo;

public class LinuxVersion extends OperatingSystemVersion{

    @Override
    public void paly(String fileName) {
        String osType = "Linux";
        this.vf.decode(osType,fileName);
    }
}
