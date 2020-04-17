package Client;

public class DatabaseLogFactory implements LogFactory {
    @Override
    public Log creatLog() {
        return new DatabaseLog();
    }
}
