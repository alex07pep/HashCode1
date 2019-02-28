import java.util.HashSet;

public class Photo {

    public HashSet<String> tags;
    public String type;
    public String id;

    public Photo(String type, HashSet<String> t, String id){
        this();
        this.type=type;
        this.tags=t;
        this.id=id;
    }

    public Photo(){
        tags = new HashSet<String>();
    }

}
