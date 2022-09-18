import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* program to parse top 500 words from
https://1000mostcommonwords.com/1000-most-common-Azerbaijani-words */
public class AzerbaijaniParser {
    public static void main(String[] args) {
        try {
            ArrayList<String> array = new ArrayList<String>();

            // these two for input from file
            FileInputStream unparsed = new FileInputStream("input/azerbaijaniInput.txt");
            Scanner scan = new Scanner(unparsed);
            // these two for output to file
            FileWriter fw = new FileWriter("output/azerbaijaniWords.txt");
            PrintWriter pw = new PrintWriter(fw);

            String line;
            while (scan.hasNextLine()) {
                line = scan.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '\t')
                    {
                       array.add(line.substring(i + 1, line.indexOf('\t', i + 1)));
                       break;
                    }
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
