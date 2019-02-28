import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        try {
        File file = new File("resources/test.txt");
        Scanner sc;

            sc = new Scanner(file);

            while (sc.hasNextLine())
            System.out.println(sc.nextLine());





        PrintWriter writer = new PrintWriter("resources/test_out.txt", "UTF-8");

        writer.println("The first line");
        writer.println("The second line");
        writer.close();

        System.out.println("Hello World!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
