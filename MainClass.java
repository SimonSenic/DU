package sk.kosickaacademic.simon.polia;

public class MainClass {
    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.isBinaryNumber(1));
        System.out.println(num.isOctalNumber(1236478));
        System.out.println(num.isHexadecimalNumber("1F010ABC9"));

        System.out.println();

        EvenNumber en = new EvenNumber();
        int[] array = new int[] { 1, 2, 3, 4, 8, 11, 15, 12, 13, 17, 23, 19 };
        int[] array2 = en.evenNumberArray(array);
        int length2 = array2.length;
        for(int a=0; a<length2; a++)
            System.out.print(array2[a] +" ");

        System.out.println();

        RandomNumber rn = new RandomNumber();
        rn.guessNumber(3); System.out.println();
        rn.computeResult(10);


    }
}
