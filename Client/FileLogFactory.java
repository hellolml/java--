package Client;

public class FileLogFactory implements LogFactory {
    @Override
    public Log creatLog() {
        return new FileLog();
    }
}
