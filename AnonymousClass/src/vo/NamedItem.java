package vo;

public class NamedItem {
    private int id;
    private String name;
    private String description;


    public NamedItem(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return String.format("id='%d', name='%s', description=Got by executing '%s';", id, name, description);
    }
}
