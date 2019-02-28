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
    }
}
