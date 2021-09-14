import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class OnePointTwoE3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = input.nextLine();
        String[] strArr;
        strArr = new String[string.length()];
        int a =0;
        int t = string.length();
        while (a<t){
            strArr[a] = string.substring(a,a + 1);
            a++;
        }
        System.out.println("Output: ");
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (strArr[i].equals(strArr[j])) {
                    System.out.print(strArr[j]);
                }
            }
        }
        }

    }

