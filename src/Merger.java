import java.util.ArrayList;
import java.util.HashSet;

public class Merger
{
    public static ArrayList<Photo> mergeVertical(ArrayList<Photo> vertical){
        int n = vertical.size();
        ArrayList<Photo> newList = new ArrayList<Photo>();

        for(int i=0;i<n;i=i+2){
            HashSet<String> combine=new HashSet<String>();

            combine.addAll(vertical.get(i).tags);
            combine.addAll(vertical.get(i+1).tags);

            newList.add(new Photo("S",combine,vertical.get(i).id+" "+vertical.get(i+1).id));
        }
        return newList;
    }
//
//            public static ArrayList<Photo> mergeVertical2(ArrayList<Photo> vertical) {
//
//                int n = vertical.size():
//                ArrayList<Photo> newList = new ArrayList<Photo>();
//                ArrayList<Photo> copyList = new ArrayList<Photo>(vertical);
//
//                Photo p = new
//                int na = copyList.size();
//                for(int i = 0;i<na;i++){
//
//                }
//                return null;
//            }
}
