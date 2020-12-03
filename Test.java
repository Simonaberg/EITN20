
import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter word to search for: ");
        String searchTerm = sc.nextLine();
        System.out.print("Enter filename: ");
        String fileName = sc.nextLine();
        sc.close();

        ArrayList<String> stringArray = new ArrayList<String>();

        // read file demo.txt
        try {
            File myObj = new File(fileName + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                stringArray.add(myReader.nextLine());
                // sb.append(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // check choosen string from input
        // split the string by spaces in a
        for (int i = 0; i < stringArray.size(); i++) {
            String a[] = stringArray.get(i).split(" ");
            // search for pattern in a

            for (int k = 0; k < a.length; k++) {
                // if match found increase count
                if (searchTerm.equals(a[k].toLowerCase()))
                    System.out.println("Found on line: " + i);

            }
        }

    }
}
