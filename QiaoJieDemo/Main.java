package QiaoJieDemo;

public class Main {
    public static void main(String args[]){
        VideoFile vf;
        OperatingSystemVersion osType = new WindowsVersion();
        vf = new AVIFile();
        osType.setFile(vf);
        osType.paly("AVI");

        VideoFile vf1;
        OperatingSystemVersion osType1 = new LinuxVersion();
        vf1 = new MPEGFile();
        osType1.setFile(vf1);
        osType1.paly("MPEG");

        VideoFile vf2;
        OperatingSystemVersion osType2 = new UnixVersion();
        vf2 = new WMFile();
        osType2.setFile(vf2);
        osType2.paly("WM");
    }
}
