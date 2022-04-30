import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) {
        StringFixedArrayList mylist = new StringFixedArrayList(15000);

        File inputFile = new File("../Texts/wordle-random.txt");

        Scanner scan = null;
        try {
            scan = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(1);
        }

        int count = 0;
        while ( scan.hasNext() ) {
            String word = scan.next();
            mylist.add(word);
            count = count + 1;
        }

        System.out.println("Read in " + count + " words.");

        for (int i = 0 ; i < mylist.length() ; i++ ) {
            String s = mylist.get(i);
            if (s.contains("m") &&
                s.contains("k") &&
                ! s.contains("i") &&
                ! s.contains("e") &&
                ! s.contains("y") &&
                s.matches("[^m].[^k]..")) {
                System.out.println(s);
            }
        }

    }
}
