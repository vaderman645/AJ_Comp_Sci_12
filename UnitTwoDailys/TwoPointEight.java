import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointEight {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add("Bart");
        names.add("Jamal");
        names.add("Sam");
        names.add("Jordan");
        int Selection = 0;
        while (Selection != 4) {
            System.out.println("1. Select Position #\n2. Add a Name\n3. Remove a Name\n4. Exit\nList of Names: " + names);

            Selection = inp.nextInt();
            switch (Selection) {
                case 1 -> {
                    System.out.println("Enter Selection #");
                    int position = inp.nextInt();
                    System.out.println(names.get(position - 1));
                }
                case 2 -> {
                    System.out.println("Enter Name to add:");
                    inp.nextLine();
                    String addName = inp.nextLine();
                    try {
                        names.add(addName);
                        System.out.println("Success!");
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }
                }
                case 3 -> {
                    System.out.println("Enter Name to Remove: ");
                    String removeName = inp.nextLine();
                    try {
                        names.remove(inp.nextLine());
                        System.out.println("Success!");
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }
                }
                case 4 -> {

                }

            }
        }

    }
}
