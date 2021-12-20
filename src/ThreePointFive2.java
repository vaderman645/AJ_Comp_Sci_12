import java.util.Scanner;

public class ThreePointFive2 {
    static int output = 1;

    static int factor(int inp) {
        if (inp == 0) {
            return output;
        }
        output = output * inp;
        return factor(inp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to get the factorial of: ");
        System.out.println(factor(input.nextInt()));
    }
}
