package waiGuanDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String encryptText,String fileNameDes){
        System.out.println("保存加密文件,并写入");
        try {
            FileOutputStream fos = new FileOutputStream(fileNameDes);
            fos.write(encryptText.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
