import java.util.Scanner;

public class TwoPointTwoE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] Names = new String[3][6];
        for (int i = 1; i < 6; i++) {
                System.out.println("Enter First Name #" + i);
                Names[1][i] = input.nextLine();
                System.out.println("Enter Last Name #" + i);
                Names[2][i] = input.nextLine();
        }
        System.out.println("Your Names Are: ");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(Names[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
}
