public class TwoPointTwoE1 {
    public static void main(String[] args) {
        String[][] dices = new String[7][7];

        for (int i = 1;i<6;i++){
            for (int j = 1; j<=6;j++) {
                dices[i][j]="("+ j +","+i+")";
                System.out.print(dices[i][j]);
            }
            System.out.print("\n");
        }

    }
}
