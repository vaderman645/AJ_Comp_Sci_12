import java.util.Scanner;

public class OnePointFive {
    static String print(String prt){System.out.println(prt);return "";}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    print("Enter a number: ");
    int user = Integer.parseInt(input.nextLine());
    boolean output1 = (user<16&&user>4) ? true : false;
    print("The number is between 5 and 15: " + output1);
    boolean output2 = (user<7||user>13) ? true : false;
    print("The number is less than 7 and greater than 13: " + output2);
    boolean output3 = (user!=9) ? true : false;
    print("The number is not 9: " + output3);
    }
}
