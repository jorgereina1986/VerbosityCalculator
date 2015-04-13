package nyc.c4q.jorgereina1986;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Jorge Reina and Elvis Boves.
 */

public class VerbosityCalculator {

    public static void average(File book) {
        try {
            Scanner sc = new Scanner(book);

            double verb = 0;
            int countWords = 0;
            String words;
            int countSentences = 0;


            while (sc.hasNext()) {
                words = sc.next();
                countWords += 1;

                if (words.equals("Dr.") || words.equals("Mr.") || words.equals("Ms.") || words.equals("Mrs.")) {
                    continue;
                } else if (words.contains(".") || words.contains("!") || words.contains("?")) {
                    countSentences += 1;
                }

            }

            verb = (double)countWords/countSentences;
            System.out.println("Words: " + countWords);
            System.out.println("Sentences: " + countSentences);
            System.out.println("Verbosity: " + verb);
            System.out.println();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        // An abstract representation of a File
        File dickerson = new File("/Users/c4q-jorgereina/Desktop/accesscode/VerbosityCalculator1/resources/pg98");
        File mobydick = new File("/Users/c4q-jorgereina/Desktop/accesscode/VerbosityCalculator1/resources/pg2701");

        System.out.println("Dickerson\n ");
        average(dickerson);
        System.out.println("MobyDick\n ");
        average(mobydick);
    }
}