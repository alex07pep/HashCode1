import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {

       ArrayList<Photo> list1 = Reader.read("resources/e_shiny_selfies.txt");

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

        FileWriter fileWriter = new FileWriter("resources/out_e_shiny_selfies.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(finalSlides.size()+"");
        for(Photo p : finalSlides){
            printWriter.println(p.id);
        }
        printWriter.close();
        System.out.println(MinClass.Min(finalSlides.get(0),finalSlides.get(1)));
        System.out.println(MinClass.Min(finalSlides.get(2),finalSlides.get(1)));
    }
}
