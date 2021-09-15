import java.util.Scanner;

public class OnePointFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a proper noun: ");
    String one = input.nextLine();
    System.out.println("Enter a noun: ");
    String two = input.nextLine();
    System.out.println("Enter a verb: ");
    String three = input.nextLine();
    String userinput = "1 was an interesting 2, but a unique 2. They could 3 better than any other 2. 3ing is 1's favourite activity";
    String firstreplace = userinput.replace("1",one);
    String secondreplace = firstreplace.replace("2",two);
    String finalreplace = secondreplace.replace("3",three);
    System.out.println(finalreplace);

    }
}
