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
        int lengthOfArray2 = array2.length;
        for(int a=0; a<lengthOfArray2; a++)
            System.out.print(array2[a] +" ");

        System.out.println();

        RandomNumber rn = new RandomNumber();
        rn.guessNumber(3); System.out.println();
        rn.computeResult(10);

        System.out.println();

        Fractions fr = new Fractions();
        fr.commonDivisor(100,62); System.out.println();
        System.out.println(fr.countBounces(162, 0.9)); System.out.println();
        fr.delChar("KEKW"); System.out.println();
        fr.divNumber("8X75Y2"); System.out.println();
        System.out.println(fr.sumFractions(100)); System.out.println();
        int[] keno = new int[20];
        int[] keno2 = fr.doNotRepeatNumber(keno);
        int lengthOfKeno2 = keno2.length;
        for(int a=0; a<lengthOfKeno2; a++)
            System.out.print(keno[a] +" ");

        System.out.println();


    }
}
