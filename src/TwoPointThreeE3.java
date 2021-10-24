import java.util.Scanner;

public class TwoPointThreeE3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character: ");
        char inp = Character.toUpperCase(input.next().charAt(0));
        int count = 0;
        int result = 0;
        for (char inpCount = inp; inpCount != '['; inpCount++, count++) {
            result = 26 - count;
        }
        System.out.println(result);
    }
}
