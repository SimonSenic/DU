package sk.kosickaacademic.simon.priklady;

import java.util.Scanner;

public class TicTacToeX {
    private int[][] array = new int[5][5];

    public static void chooseTile(int[][] arr){
        int range=arr.length*arr[0].length, player=1, count=0, a;

        while(1>0){
            System.out.println("Choose tile: " +"(Player " +player +") ");
            showGameStatus(arr);
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            if(a<1 || a>range) { System.out.println("Wrong tile.. try again. "); continue; }
            int row=(a-1)/arr.length;
            int column=(a-1)%arr.length;
            if(arr[row][column]!=0) { System.out.println("Tile is occupied.. try again. "); continue; }
            arr[row][column]=player; checkResults(arr, player);

            if(player==1 || player==2) player++;
            else player=1;
            count++; if(count==range) { showGameStatus(arr); System.out.println("Draw! "); break; }
        }

    }

    public static void showGameStatus(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++)
                System.out.print(arr[i][j] +" ");
            System.out.println();
        }

        System.out.println();
    }

    public static void checkResults(int[][] arr, int player){
        int l=4;

        for(int i=0; i<arr.length; i++){ //In row
            int j=0, count=0;
            while(j<arr[0].length){
                if(arr[i][j]==player) count++;
                else count=0;
                if(count==l) { showGameStatus(arr); System.out.println("Player " +player +" won! "); System.exit(0); }
                j++;
            }
        }

        for(int j=0; j<arr[0].length; j++){ //In column
            int i=0, count=0;
            while(i<arr.length){
                if(arr[i][j]==player) count++;
                else count=0;
                if(count==l) { showGameStatus(arr); System.out.println("Player " +player +" won! "); System.exit(0); }
                i++;
            }
        }

        int j=0, count=0; //In diagonal
        while(j<arr.length){
            if(arr[j][j]==player) count++;
            else count=0;
            if(count==l) { showGameStatus(arr); System.out.println("Player " +player +" won! "); System.exit(0); }
            j++;
        }

        int i=0;
        j=arr[0].length-1; count=0; //In reversed diagonal
        while(j>=0){
            if(arr[i][j]==player) count++;
            else count=0;
            if(count==l) { showGameStatus(arr); System.out.println("Player " +player +" won! "); System.exit(0); }
            i++; j--;
        }

    }

    public static void main(String[] args) {
        TicTacToeX ttt = new TicTacToeX();
        chooseTile(ttt.array);
    }

}