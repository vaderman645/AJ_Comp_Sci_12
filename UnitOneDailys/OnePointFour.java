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
    String userinput = "1 was an interesting 2, but a unique 2. They could 3 better than any other 2. 4ing is 1's favourite activity";
    String firstreplace = userinput.replace("1",one);
    String secondreplace = firstreplace.replace("2",two);
    String thirdreplace = secondreplace.replace("3",three);
    String finalreplace = thirdreplace.replace("4",three.substring(0,1).toUpperCase()+three.substring(1)); //challenge
    System.out.println(finalreplace);

    }
}
