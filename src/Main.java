import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {

       ArrayList<Photo> list1 = Reader.read("resources/a_example.txt");

       System.out.println(list1);

       System.out.println(MinClass.Min(list1.get(0),list1.get(1)));

        System.out.println(MinClass.Min(list1.get(1),list1.get(2)));
        System.out.println(MinClass.Min(list1.get(0),list1.get(3)));
    }
}
