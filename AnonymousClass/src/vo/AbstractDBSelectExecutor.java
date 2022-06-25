package vo;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDBSelectExecutor {
    private String execute;

    public String getExecute(){
        execute = "SELECT * FROM ";
        return execute;
    }
    public List getList() {
        return new ArrayList<>();
    }
}
