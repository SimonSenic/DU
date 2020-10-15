package sk.kosickaacademic.simon.polia;

import java.util.Scanner;

public class RandomNumber {
    public void guessNumber(int max){
        int number=(int)(Math.random()*max);
        int guess, i=1;
        System.out.println("Guess the number: ");

        do{
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

            if (guess == number) System.out.println("You guessed the number! ");
            else if(guess != number && i==12) { System.out.println("You did not guess the number 7x.. you are worthless! xD "); System.exit(0); }
            else if (guess < number) { i++; System.out.println("Wrong guess.. try a higher number. "); }
            else { i++; System.out.println("Wrong guess.. try a smaller number. "); }

        }while(guess != number);

    }

    public void computeResult(int max){
        int result, x, correct=0, i=1;

        for(i=1; i<=10; i++){
            int num1=(int)(Math.random()*max);
            int num2=(int)(Math.random()*max);
            System.out.println("Compute: " +num1 +" * " +num2);

            Scanner sc = new Scanner(System.in);
            result = sc.nextInt();
            x=num1*num2;

            if(result==x) { correct++; System.out.println("Result is correct! "); }
            else { System.out.println("Wrong result "); }

        }
        System.out.println("Correct results: " +correct +"/" +(i-1) +" (" +(correct*100/max) +"%)");

    }
}
