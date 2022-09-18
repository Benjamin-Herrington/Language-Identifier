import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* program to parse top 500 words from
https://frequencylists.blogspot.com/2016/05/the-500-most-frequently-used-german.html */
public class GermanParser {
    public static void main(String[] args) {
        try {
            ArrayList<String> array = new ArrayList<String>();

            // these two for input from file
            FileInputStream unparsed = new FileInputStream("input/germanInput.txt");
            Scanner scan = new Scanner(unparsed);
            // these two for output to file
            FileWriter fw = new FileWriter("output/germanWords.txt");
            PrintWriter pw = new PrintWriter(fw);

            String line;
            while (scan.hasNextLine()) {
                line = scan.nextLine();

                if (line.indexOf('.') != -1 && line.indexOf('.') != line.length() - 1) {
                    array.add(line.substring(line.indexOf('.') + 2));
                }
            }

            for (int i = 0; i < array.size() - 1; i++) {
                System.out.println(array.get(i));
                pw.write(array.get(i) + ' ');
            }
            pw.write(array.get(array.size() - 1));
            // close our streams for good measure
            pw.close();
            fw.close();
            unparsed.close();
            scan.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
