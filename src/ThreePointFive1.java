import java.util.Scanner;

public class ThreePointFive1 {
    static int output = 1;

    static int exponents(int base, int exponent) {
        if (exponent == 0) {
            return output;
        }
        output = output * base;
        return (exponents(base, exponent - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your base: ");
        int base = input.nextInt();
        System.out.println("Enter your exponent: ");
        int exponent = input.nextInt();
        System.out.println(exponents(base, exponent));
    }
}
