import java.util.HashSet;

public class Photo {

    public HashSet<String> tags;
    public String type;

    public Photo(String type, HashSet<String> t){
        this();
        this.type=type;
        this.tags=t;
    }

    public Photo(){
        tags = new HashSet<String>();
    }

}
