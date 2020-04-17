package Client;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        FileLogFactory fileLogFactory = new FileLogFactory();
        DatabaseLogFactory databaseLogFactory = new DatabaseLogFactory();
        Log fileLog = fileLogFactory.creatLog();
        Log databaseLog = databaseLogFactory.creatLog();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输如您要记录的方式:");
            String select = sc.nextLine();
            if (select.equals("文件记录")) {
                fileLog.witeLog();
            } else if (select.equals("数据库记录")) {
                databaseLog.witeLog();
            } else {
                System.out.println("输入错误,已退出");
                break;
            }
        }
    }
}
