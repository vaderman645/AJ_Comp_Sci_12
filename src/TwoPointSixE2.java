import java.util.Scanner;

public class TwoPointSixE2 {
    static String strTest() {
        Scanner input = new Scanner(System.in);

        String i = "";
        int loop = 1;
        while (loop == 1) {
            String ret = input.nextLine();
            if (ret.isBlank()) {
                System.out.println("Error!");
            } else {
                loop = 2;
                i = ret;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.print(strTest());
    }
}
