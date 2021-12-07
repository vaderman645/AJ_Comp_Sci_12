import java.util.Scanner;

public class TwoPointSixE1 {
    static int Errors(){
        Scanner input = new Scanner(System.in);

        int i = 0;
        int loop = 1;
        while (loop==1){
            String ret = input.nextLine();
            try {
               i = Integer.parseInt(ret);
               loop = 2;
            }
            catch (Exception e) {
                System.out.println("Error!");
            }
        }
        return i;
    }

    public static void main(String[] args) {
System.out.println(Errors());
    }
}
