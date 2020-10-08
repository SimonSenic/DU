package sk.kosickaacademic.simon.polia;

public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int i;
        double x=0;
        int size=-1;
        size=size+array.length;
        for(i=0; i<=size; i++){
            x=x+array[i];
        }
        x=x/i;
        System.out.println(x);
    }
}
