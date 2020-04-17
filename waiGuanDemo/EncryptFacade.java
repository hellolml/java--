package waiGuanDemo;

public class EncryptFacade {
     private FileReader fileReader;
     private CipherMachine cipherMachine;
     private FileWriter fileWriter;
    public EncryptFacade(){
        this.fileReader = new FileReader();
        this.cipherMachine = new CipherMachine();
        this.fileWriter = new FileWriter();
    }
    public void fileEncrpyt(String fileNameSrc,String fileNameDes){
        String plainStr = fileReader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrpyt(plainStr);
        fileWriter.write(encryptStr,fileNameDes );
    }
}
