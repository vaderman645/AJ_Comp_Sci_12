import java.util.Scanner;

public class TwoPointFourE1 {
    static String RockPaper (String playerInt, String oppInp){
        if (playerInt == oppInp){return "Tie!";}
        else if (playerInt=="rock"&&oppInp=="scissors"){
            return"Player Wins!";
        }
        else {return"";}
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Input (Rock, Paper, Scissors");
        String playerInp = input.nextLine();
        System.out.println("Enter Opponent Input");
        String oppInp = input.nextLine();
        System.out.println();
    }
}
