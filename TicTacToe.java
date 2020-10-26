package sk.kosickaacademic.simon.priklady;

public class TicTacToe {
    private int[][] array = new int[][] { {1,1,2},{1,2,1},{1,1,1} };

    public static void checkResults(int[][] array){
        int count1InRow, count2InRow, count1InColumn, count2InColumn;
        int count1InDiagonal=0, count2InDiagonal=0, count1InReversedDiagonal=0, count2InReversedDiagonal=0;

        for(int i=0; i<array.length; i++){ //Row
            count1InRow=0; count2InRow=0;
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]==1) count1InRow++;
                else if(array[i][j]==2) count2InRow++;
            }
            if(count1InRow==array[0].length) { System.out.println("Player 1 won! "); System.exit(0); }
            else if(count2InRow==array[0].length) { System.out.println("Player 2 won! "); System.exit(0); }
        }

        for(int j=0; j<array[0].length; j++){ //Column
            count1InColumn=0; count2InColumn=0;
            for(int i=0; i<array.length; i++){
                if(array[i][j]==1) count1InColumn++;
                else if(array[i][j]==2) count2InColumn++;
            }
            if(count1InColumn==array.length) { System.out.println("Player 1 won! "); System.exit(0); }
            else if(count2InColumn==array.length) { System.out.println("Player 2 won! "); System.exit(0); }
        }

        int j=0;
        for(int i=0; i<array.length; i++){ //Diagonal
            if(array[i][j]==1) count1InDiagonal++;
            else if(array[i][j]==2) count2InDiagonal++;
            j++;
        }
        if(count1InDiagonal==array.length) { System.out.println("Player 1 won! "); System.exit(0); }
        else if(count2InDiagonal==array.length) { System.out.println("Player 2 won! "); System.exit(0); }

        j=array[0].length-1;
        for(int i=0; i<array.length; i++){ //Reversed Diagonal
            if(array[i][j]==1) count1InReversedDiagonal++;
            else if(array[i][j]==2) count2InReversedDiagonal++;
            j--;
        }
        if(count1InReversedDiagonal==array.length) { System.out.println("Player 1 won! "); System.exit(0); }
        else if(count2InReversedDiagonal==array.length) { System.out.println("Player 2 won! "); System.exit(0); }

    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        checkResults(ttt.array);
    }

}
