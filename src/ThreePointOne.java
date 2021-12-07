import java.util.Scanner;

public class ThreePointOne {
    public static void main(String[] args) {
        String[] arr = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle",
                "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto",
                "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran", "Nidorina", "Nidoqueen", "Nidoran", "Nidorino", "Nidoking", "Clefairy", "Cle fable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplum e", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", " Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath", "Abra"
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String userInp = input.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(userInp)){System.out.println("Your Inputted Name was Found at index: "+ i);}
        }
    }
}
