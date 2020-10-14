package sk.kosickaacademic.simon.polia;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int number, s;
        String hex="";
        int result=0;
        int i=0;

        System.out.println("enter number system: ");
        Scanner sys = new Scanner(System.in);
        s = sys.nextInt();

        if(s==2) {
            System.out.println("enter number: ");
            Scanner num = new Scanner(System.in);
            number = num.nextInt();

            while (number>0) {
                if ((number % 10) != 0 && (number % 10) != 1) { System.out.println("error"); System.exit(0); }
                result+=(number%10)*(int)Math.pow(2, i);
                number/=10;
                i++;
            }
            System.out.println(result);

        }else if(s==8){
            System.out.println("enter number: ");
            Scanner num = new Scanner(System.in);
            number = num.nextInt();

            while(number>0) {
                result+=(number%10)*(int)Math.pow(8, i);
                number/=10;
                i++;
            }
            System.out.println(result);

        }else if(s==16){
            System.out.println("enter number: ");
            Scanner hx = new Scanner(System.in);
            hex = hx.nextLine();
            int length = hex.length();
            for(int j=length-1; j>=0; j--){
                char a = hex.charAt(j);
                switch(a){
                    case '0': result+=0; break;
                    case '1': result+=(int)Math.pow(16, i); break;
                    case '2': result+=2*(int)Math.pow(16, i); break;
                    case '3': result+=3*(int)Math.pow(16, i); break;
                    case '4': result+=4*(int)Math.pow(16, i); break;
                    case '5': result+=5*(int)Math.pow(16, i); break;
                    case '6': result+=6*(int)Math.pow(16, i); break;
                    case '7': result+=7*(int)Math.pow(16, i); break;
                    case '8': result+=8*(int)Math.pow(16, i); break;
                    case '9': result+=9*(int)Math.pow(16, i); break;
                    case 'A': result+=10*(int)Math.pow(16, i); break;
                    case 'B': result+=11*(int)Math.pow(16, i); break;
                    case 'C': result+=12*(int)Math.pow(16, i); break;
                    case 'D': result+=13*(int)Math.pow(16, i); break;
                    case 'E': result+=14*(int)Math.pow(16, i); break;
                    case 'F': result+=15*(int)Math.pow(16, i); break;
                }
                i++;
            }
            System.out.println(result);

        }else System.out.println("error");

    }
}
