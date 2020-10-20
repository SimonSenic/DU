package sk.kosickaacademic.simon.loteria;

import java.util.Scanner;

public class Lottery {
    private int[] tip = new int[5];
    private int[] lot = new int[10];
    double bet;
    public static void main(String[] args) {
        Lottery l = new Lottery();
        l.betValue();
        l.enterNumbers();
        l.drawNumbers();
        l.matchResults();
    }

    public void betValue(){
        do{
            System.out.print("Enter your bet: ");
            Scanner sc = new Scanner(System.in);
            bet=sc.nextDouble();
            if(bet<=0) System.out.println("Wrong value.. try again. ");

        }while(bet<=0);
    }

    public void enterNumbers(){
        int i=0, a;
        Scanner sc = new Scanner(System.in);
        while(i<tip.length){
            System.out.print("Enter " +(i+1) +". number: ");
            a = sc.nextInt();
            if(a>0 && a<21 && checkNumbers(i, a)){
                tip[i]=a;
                i++;
            }else System.out.println("Wrong number.. try again a different one. ");

        }
        System.out.println("Your Tip: ");
        for(i=0; i<tip.length; i++) System.out.print(tip[i] +" ");
        System.out.println();
    }

    public void drawNumbers(){
        int i=0, a;
        while(i<lot.length){
            a=(int)(Math.random()*20+1);
            if(checkDrawnNumbers(i, a)){
                lot[i]=a;
                i++;
            }

        }
        System.out.println("Drawn numbers are: ");
        for(i=0; i<lot.length; i++) System.out.print(lot[i] +" ");
        System.out.println();
    }

    public void matchResults(){
        int count=0;
        System.out.println("Numbers guessed: ");
        for(int i=0; i<tip.length; i++)
            for(int j=0; j<lot.length; j++)
                if(lot[j]==tip[i]) { System.out.print(lot[j] +" "); count++; }

        if(count==0) System.out.println("None");
        else System.out.println();


        switch(count){
            case 0: case 1: System.out.println("You lost"); break;
            case 2: System.out.println("You won " +(bet*2) +"€"); break;
            case 3: System.out.println("You won " +(bet*15) +"€"); break;
            case 4: System.out.println("You won " +(bet*500) +"€"); break;
            case 5: System.out.println("You won " +(bet*10000) +"€"); break;
        }
    }

    public boolean checkNumbers(int i, int a){
        if(i==0) return true;
        for(int j=0; j<i; j++) if(a==tip[j]) return false;
        return true;
    }

    public boolean checkDrawnNumbers(int i, int a){
        if(i==0) return true;
        for(int j=0; j<i; j++) if(a==lot[j]) return false;
        return true;
    }

}
