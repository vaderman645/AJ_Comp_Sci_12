public class TwoPointTwoE3 {
    public static void main(String[] args) {
        char[][] arr = new char[5][];
        String[] name = {"Turing","Schwartz","Burners-Lee","Lovelace","Torvalds"};
        for (int i = 0;i<4;i++){arr[i]=new char[name[i].length()];}
        for (int i = 0;i<5;i++){arr[i] = name[i].toCharArray();}

        for (int i = 0;i<5;i++){
            for (int x = 0;x<arr[i].length;x++){
                System.out.print(arr[i][x]);
            }
            System.out.println();
        }


    }
}
