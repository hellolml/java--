package QiaoJieDemo;

public class WMFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("操作系统:"+" "+osType+"文件类型 "+fileName);
    }
}
