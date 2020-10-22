package sk.kosickaacademic.simon.dvojrozmernepole;

public class Table {
    private int[][] array = new int[][] { {2,3,5,6},{1,8,9,7},{2,12,3,4} };

    public int minimum(){
        int min=array[0][0];
        int i, j;
        for(i=0; i<3; i++)
            for(j=0; j<4; j++)
                min=array[i][j]<min?array[i][j]:min;

        return min;
    }

    public int maximum(){
        int max=array[0][0];
        int i, j;
        for(i=0; i<3; i++)
            for(j=0; j<4; j++)
                max=array[i][j]>max?array[i][j]:max;

        return max;
    }

    public double michaelAverage(){
        int avew=array[0][0];
        int i, j=0;
        for(i=0; i<3; i++)
            for(j=0; j<4; j++)
                avew+=array[i][j];

        return avew/(i*j);
    }

    public int sumUnderDiagonale(){
        int sum=0;
        int i, j;
        for(i=0; i<3; i++)
            for(j=0; j<4; j++)
                if(j<i) sum+=array[i][j];

        return sum;
    }

    public static void main(String[] args) {
        Table t = new Table();
        System.out.println("Min. number is: " +t.minimum());
        System.out.println("Max. number is: " +t.maximum());
        System.out.println("Average number is: " +t.michaelAverage());
        System.out.println("Sum of numbers under diagonale is: " +t.sumUnderDiagonale());
    }

}
