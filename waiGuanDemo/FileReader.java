package waiGuanDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
    public String read(String fileNameSrc){
        System.out.println("读取源文件");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fs = new FileInputStream(fileNameSrc);
            int ch;
            while ((ch=fs.read())!=-1){
                sb.append((char)ch);
            }
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}