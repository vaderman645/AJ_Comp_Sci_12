public class TwoPointFourE3 {
    static String seperator (String inp,int Length){
        String marioBros = "Mario, Luigi, Toad, Koopa, Bowser, and Peach";
        return marioBros.substring(marioBros.indexOf(inp),marioBros.indexOf(inp)+Length);
    }
    public static void main(String[] args) {
        String [] marioArr = new String[6];

        marioArr[0]=seperator("Mario",5);
        marioArr[1]=seperator("Luigi",5);
        marioArr[2]=seperator("Toad",4);
        marioArr[3]=seperator("Koopa",5);
        marioArr[4]=seperator("Peach",5);
        for (int i = 0;i<5;i++){
          System.out.println(marioArr[i]);
        }
    }
}
