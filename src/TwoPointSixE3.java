import java.util.Scanner;

public class TwoPointSixE3 {
    static char strTest() {
        Scanner input = new Scanner(System.in);

        char i = ' ';
        int loop = 1;
        while (loop == 1) {
            String ret = input.nextLine();
            if (ret.length()==1) {
                loop = 2;
                i=ret.charAt(0);
            } else {
                System.out.println("Error!");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.print(strTest());
    }
}
