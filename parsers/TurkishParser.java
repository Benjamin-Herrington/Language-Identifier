import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* program to parse top 500 words from
https://github.com/hermitdave/FrequencyWords/tree/master/content/2016 */
public class TurkishParser {
    public static void main(String[] args) {
        try {
            ArrayList<String> array = new ArrayList<String>();

            // these two for input from file
            FileInputStream unparsed = new FileInputStream("input/turkishInput.txt");
            Scanner scan = new Scanner(unparsed);
            // these two for output to file
            FileWriter fw = new FileWriter("output/turkishWords.txt");
            PrintWriter pw = new PrintWriter(fw);

            String line;
            int counter = 0; // we only want 500 words
            while (counter++ < 500) {
                line = scan.nextLine();

                array.add(line.substring(0, line.indexOf(' ')));
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
