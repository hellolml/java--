package waiGuanDemo;

public class CipherMachine {
    public String encrpyt(String plainText){
        System.out.println("数据加密");
        StringBuilder sb = new StringBuilder(plainText);
        return sb.reverse().toString();
    }
}
