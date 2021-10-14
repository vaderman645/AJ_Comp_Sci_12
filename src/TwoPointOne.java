public class TwoPointOne {
    public static void main(String[] args) {
        char c = '@';
    for (byte i = 1;i<=10;i++){
        System.out.print("\n--------------------------------------------------\n");
        c +=1;
        for (byte j = 1; j<=10;j++){
            System.out.print(" |"+c+""+j+" ");
        }
    }
    }
}
