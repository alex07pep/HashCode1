import java.util.HashSet;

public class MinClass {

    public static int Min(Photo photo1, Photo photo2)
    {

        HashSet<String> list1 = new HashSet<String>(photo1.tags);
        HashSet<String> list2 = new HashSet<String>(photo2.tags);

        list1.removeAll(list2);
        int inList1 = list1.size();

        list1 = new HashSet<String>(photo1.tags);
        list2 = new HashSet<String>(photo2.tags);

        list2.removeAll(list1);
        int inList2 = list2.size();

        list1 = new HashSet<String>(photo1.tags);
        list2 = new HashSet<String>(photo2.tags);
        list1.retainAll(list2);
        int inBothList = list1.size();

        return Math.min(Math.min(inList1, inList2), inBothList);

    }

    public static int Min2(Photo photo1, Photo photo2)
    {

       HashSet<String> combine = new HashSet<String>(photo1.tags);


        combine.retainAll(photo2.tags);
        int l1=photo1.tags.size();
        int l2 = photo2.tags.size();
        int c=combine.size();

        return Math.min(l1-c,Math.min(l2-c,c));

    }


}
