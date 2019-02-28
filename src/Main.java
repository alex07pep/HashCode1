import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {

       ArrayList<Photo> list1 = Reader.read("resources/b_lovely_landscapes.txt");

       ArrayList<Photo> verticalPhotos = new ArrayList<Photo>();
       ArrayList<Photo> horizontalPhotos = new ArrayList<Photo>();

        for (Photo item : list1) {
            if(item.type.equals("V")){
                verticalPhotos.add(item);
            }else{
                horizontalPhotos.add(item);
            }
        }
        ArrayList<Photo> verticalSlides = Merger.mergeVertical(verticalPhotos);

        ArrayList<Photo> finalSlides = new ArrayList<Photo>();
        finalSlides.addAll(horizontalPhotos);
        finalSlides.addAll(verticalSlides);

        ArrayList<Photo> forPrintSlides = new ArrayList<Photo>();

        int n = 0;
        int max = -1;
        int index=-1;
        Photo photo = finalSlides.get(0);
        finalSlides.remove(0);
        forPrintSlides.add(photo);

        while(finalSlides.size()>0) {

            n = 0;
            max = -1;
            index = -1;
            n = finalSlides.size();
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                int micut = MinClass.Min(photo, finalSlides.get(i));
                if (micut > max) {
                    max = micut;
                    index = i;
                }
                if(i>100)
                    break;
            }
            photo=finalSlides.get(index);
            forPrintSlides.add(photo);
            finalSlides.remove(index);
        }




        FileWriter fileWriter = new FileWriter("resources/1out_b_lovely_landscapes.txt.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(forPrintSlides.size()+"");
        for(Photo p : forPrintSlides){
            printWriter.println(p.id);
        }
        printWriter.close();

    }
}
