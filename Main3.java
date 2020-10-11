package sk.kosickaacademic.simon.polia;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n=0;
        int s=0;
        int i=1, j=1;
        System.out.println("zadaj cislo: ");
        do{
            if(i>1 && i!=6) System.out.println("cislo musi byt kladne.. zadaj nove: ");
            if(i==6){ System.out.println("5x si zadal nespravne cislo pepega.. mam toho dost :P "); System.exit(0); }
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n>0){
                System.out.println("zadaj sustavu (2, 8, 16): ");
                do{
                    if(j>1 && j!=6) System.out.println("musis zadat sustavu 2, 8 alebo 16.. skus to znova: ");
                    if(j==6) { System.out.println("uz 5x si zadal nespravnu sustavu "); System.exit(0); }
                    Scanner cs = new Scanner(System.in);
                    s = cs.nextInt();
                    if(s==2){
                        long z=10;
                        long z2=0;

                        while(n>1){
                            z=z+(n%2);
                            z*=10;
                            n/=2;
                        }
                        z+=1;

                        while(z>0)
                        {
                            z2=z2+z%10;
                            z=z/10;
                            z2=z2*10;
                        }
                        z2=z2/100;

                        System.out.println(z2);

                    }else if(s==8){
                        long z=10;
                        long z2=0;

                        while(n>1){
                            z=z+(n%8);
                            z*=10;
                            n/=8;
                        }
                        z+=n;

                        while(z>0)
                        {
                            z2=z2+z%10;
                            z=z/10;
                            z2=z2*10;
                        }
                        z2=z2/100;

                        System.out.println(z2); System.exit(0);

                    }else if(s==16){
                        int z;
                        String x="";
                        char hex[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };

                        while(n>0){
                            z=n%16;
                            x=hex[z]+x;
                            n/=16;
                        }

                        System.out.println(x); System.exit(0);

                    }
                    j++;
                }while(s!=2 && s!=8 && s!=16);
            }
            i++;
        }while(n<1);

    }
}
