import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Reader {

    static File file;
    static Scanner sc;


    public static ArrayList<Photo> read(String fileString) throws Exception{

        ArrayList<Photo> list = new ArrayList<Photo>();
        file = new File(fileString);
        sc = new Scanner(file);

        int  n = Integer.parseInt(sc.nextLine());


        for (int i =0;i<n;i++){

            String line = sc.nextLine();

            String [] parts= line.split(" ");

            int nrTags = Integer.parseInt(parts[1]);
            HashSet<String> tags = new HashSet<String>();

            for(int j=0;j<nrTags;j++){
                tags.add(parts[j+2]);
            }
            list.add(new Photo(parts[0],tags,i));

        }
        sc.close();
        return list;


    }
}
