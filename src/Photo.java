import java.util.HashSet;

public class Photo {

    public HashSet<String> tags;
    public String type;
    public int id;

    public Photo(String type, HashSet<String> t, int id){
        this();
        this.type=type;
        this.tags=t;
        this.id=id;
    }

    public Photo(){
        tags = new HashSet<String>();
    }

}
