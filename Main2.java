package sk.kosickaacademic.simon.polia;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n=0;
        int s=0;
        int i=1, j=1;

        System.out.println("zadaj cislo: ");
        while(n<1){
            if(i>1 && i!=6) System.out.println("cislo musi byt kladne.. zadaj nove: ");
            else if(i==6){ System.out.println("5x si zadal nespravne cislo pepega.. mam toho dost :P "); System.exit(0); }
            i++;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }

        System.out.println("zadaj sustavu (2, 8, 16): ");
        do{
            if(j>1 && j!=6) System.out.println("musis zadat sustavu 2, 8 alebo 16.. skus to znova: ");
            if(j==6) { System.out.println("uz 5x si zadal nespravnu sustavu.. kaslem na to "); System.exit(0); }
            Scanner cs = new Scanner(System.in);
            s = cs.nextInt();
            if(s==2){
                int z;
                String x="";

                while(n>0){
                    z=n%2;
                    x=z+x;
                    n/=2;
                }

                System.out.println(x);

            }else if(s==8){
                int z;
                String x="";

                while(n>0){
                    z=n%8;
                    x=z+x;
                    n/=8;
                }

                System.out.println(x);

            }else if(s==16){
                int z;
                String x="";

                while(n>0){
                    z=n%16;

                    switch(z){
                        case 10: x="A"+x; break;
                        case 11: x="B"+x; break;
                        case 12: x="C"+x; break;
                        case 13: x="D"+x; break;
                        case 14: x="E"+x; break;
                        case 15: x="F"+x; break;
                        default: x=z+x;;
                    }
                    n/=16;
                }

                System.out.println(x);

            }
            j++;

        }while(s!=2 && s!=8 && s!=16);

    }
}
