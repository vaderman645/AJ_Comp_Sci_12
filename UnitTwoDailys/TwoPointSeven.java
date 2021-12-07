import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class TwoPointSeven {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Five Names: ");
        String[] names = new String[5];
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            names[i] = input.nextLine();
        }
        System.out.println("Enter Five Scores: ");
        for (int i = 0; i < 5; i++) {
            scores[i] = input.nextInt();
        }

        File myFile = new File("FileName.txt");
        myFile.createNewFile();

        FileWriter myWriter = new FileWriter("FileName.txt");
        for (int i = 0; i < 5; i++) {
            myWriter.write(names[i] + " " + scores[i] + "\n");
        }

        myWriter.close();

        Scanner myReader = new Scanner(myFile);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();

            System.out.println(data);

        }
    }
}
