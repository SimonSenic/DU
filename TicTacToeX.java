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
            arr[row][column]=player; checkResults(arr);

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

    public static void checkResults(int[][] arr){
        int count1InRow, count2InRow, count3InRow, count1InColumn, count2InColumn, count3InColumn;
        int count1InDiagonal=0, count2InDiagonal=0, count3InDiagonal=0, count1InReversedDiagonal=0, count2InReversedDiagonal=0, count3InReversedDiagonal=0;

        for(int i=0; i<arr.length; i++){ //Row
            count1InRow=0; count2InRow=0; count3InRow=0;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==1) count1InRow++;
                else if(arr[i][j]==2) count2InRow++;
                else if(arr[i][j]==3) count3InRow++;
            }
            if(count1InRow==arr[0].length-1) { showGameStatus(arr); System.out.println("Player 1 won! "); System.exit(0); }
            else if(count2InRow==arr[0].length-1) { showGameStatus(arr); System.out.println("Player 2 won! "); System.exit(0); }
            else if(count3InRow==arr[0].length-1) { showGameStatus(arr); System.out.println("Player 3 won! "); System.exit(0); }
        }

        for(int j=0; j<arr[0].length; j++){ //Column
            count1InColumn=0; count2InColumn=0; count3InColumn=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i][j]==1) count1InColumn++;
                else if(arr[i][j]==2) count2InColumn++;
                else if(arr[i][j]==3) count3InColumn++;
            }
            if(count1InColumn==arr.length-1) { showGameStatus(arr); System.out.println("Player 1 won! "); System.exit(0); }
            else if(count2InColumn==arr.length-1) { showGameStatus(arr); System.out.println("Player 2 won! "); System.exit(0); }
            else if(count3InColumn==arr.length-1) { showGameStatus(arr); System.out.println("Player 3 won! "); System.exit(0); }
        }

        int j=0;
        for(int i=0; i<arr.length; i++){ //Diagonal
            if(arr[i][j]==1) count1InDiagonal++;
            else if(arr[i][j]==2) count2InDiagonal++;
            else if(arr[i][j]==3) count3InDiagonal++;
            j++;
        }
        if(count1InDiagonal==arr.length-1) { showGameStatus(arr); System.out.println("Player 1 won! "); System.exit(0); }
        else if(count2InDiagonal==arr.length-1) { showGameStatus(arr); System.out.println("Player 2 won! "); System.exit(0); }
        else if(count3InDiagonal==arr.length-1) { showGameStatus(arr); System.out.println("Player 3 won! "); System.exit(0); }

        j=arr[0].length-1;
        for(int i=0; i<arr.length; i++){ //Reversed Diagonal
            if(arr[i][j]==1) count1InReversedDiagonal++;
            else if(arr[i][j]==2) count2InReversedDiagonal++;
            else if(arr[i][j]==3) count3InReversedDiagonal++;
            j--;
        }
        if(count1InReversedDiagonal==arr.length-1) { showGameStatus(arr); System.out.println("Player 1 won! "); System.exit(0); }
        else if(count2InReversedDiagonal==arr.length-1) { showGameStatus(arr); System.out.println("Player 2 won! "); System.exit(0); }
        else if(count3InReversedDiagonal==arr.length-1) { showGameStatus(arr); System.out.println("Player 3 won! "); System.exit(0); }

    }

    public static void main(String[] args) {
        TicTacToeX ttt = new TicTacToeX();
        chooseTile(ttt.array);
    }

}