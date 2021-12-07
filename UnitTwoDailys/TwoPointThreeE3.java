import java.util.Scanner;
public class TwoPointThreeE3 {
    static int result (char inp){
        int count = 0;
        int result = 0;
        for (char inpCount = inp; inpCount != '['; inpCount++, count++) {
            result = 26 - count;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character: ");
        char inp = Character.toUpperCase(input.next().charAt(0));

        System.out.println(result(inp));
    }
}
