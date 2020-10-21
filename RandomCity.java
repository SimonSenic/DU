package sk.kosickaacademic.simon.hra;

import java.util.Random;
import java.util.Scanner;

public class RandomCity {
    public String drawRandomCity(){
        String[] array = new String[] { "Bratislava","Zvolen","Michalovce","Sobrance","Humenne" };
        Random rnd = new Random();
        int city = rnd.nextInt(array.length);
        String text = array[city];
        int length = text.length();
        int i=1, a, b, c;

        do{
            System.out.println("Guess the city (" +i +"/3): ");
            do{ a = rnd.nextInt(length); b = rnd.nextInt(length); c = rnd.nextInt(length); }
            while(a==b || a==c || b==c);
            for(int j=0; j<length; j++) if(j==a || j==b || j==c) System.out.print(text.charAt(j)); else System.out.print("_");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            String guess = sc.nextLine();
            if(text.compareToIgnoreCase(guess)==0) { System.out.print("You guessed the city! Great job!! "); return text; } else if(i!=3) System.out.println("Wrong guess.. try again. "); i++;
        }while(i<=3);

        System.out.println("You failed in 3/3 attempts.. Game over! ");
        return null;
    }

    public static void main(String[] args) {
        RandomCity rc = new RandomCity();
        rc.drawRandomCity();
    }
}
