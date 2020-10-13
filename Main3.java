package sk.kosickaacademic.simon.polia;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int number, s;
        int result=0;
        int i=0;
        System.out.println("enter number: ");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();

        System.out.println("enter number system: ");
        Scanner sys = new Scanner(System.in);
        s = sys.nextInt();

        if(s==2) {
            while (number>0) {
                if ((number % 10) != 0 && (number % 10) != 1) { System.out.println("error"); System.exit(0); }
                result+=(number%10)*(int)Math.pow(2, i);
                number/=10;
                i++;
            }
            System.out.println(result);

        }else if(s==8){
            while(number>0) {
                result+=(number%10)*(int)Math.pow(8, i);
                number/=10;
                i++;
            }
            System.out.println(result);

        }/*else if(s==16){
            while(number>0) {
                result+=(number%10)*(int)Math.pow(16, i);
                number/=10;
                i++;
            }
            System.out.println(result); */

        }else System.out.println("error");

    }
}
