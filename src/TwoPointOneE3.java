public class TwoPointOneE3 {
    public static void main(String[] args) {
        byte x = 1;
        for (byte i = 1;i<=7;i++){
            for (byte j = 1; j<=i;j++,x++) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
