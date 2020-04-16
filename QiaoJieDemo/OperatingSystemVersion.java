package QiaoJieDemo;

public abstract class OperatingSystemVersion {
    protected VideoFile vf;
    public void setFile(VideoFile vf) {
        this.vf = vf;
    }

    public abstract void paly(String fileName);
}
