import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();
        int key = 0;
        File file = new File("sample_50.txt");
        Scanner inputFile = new Scanner(file);
        Scanner userInput = new Scanner(System.in);

        // store numbers in list
        while(inputFile.hasNextLine())
            numbers.add(Integer.parseInt(inputFile.nextLine()));

        // algorithm
        System.out.println("Enter the number you wish to look for");
        System.out.print(">>> ");
        key = userInput.nextInt();

        for(int num:numbers){
            if(num == key){
                System.out.println("Number Found!");
                System.exit(419);
            }
        }

        System.out.println("Number was not found!");
    }
}
