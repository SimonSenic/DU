package sk.kosickaacademic.simon.polia;

public class Fractions {
    public void commonDivisor(int a, int b){
        int i=2;
        while(i<=a){
            if(a%i==0 && b%i==0){
                a/=i; b/=i;
            }else if(i==2) i++;
            else i+=2;
        }
        System.out.println(a +" " +b);

    }

    public int countBounces(double height, double coefficient){
        int count=0;
        while(height>=100){
            height*=coefficient;
            count++;
        }
        return count;
    }

    public void delChar(String word){ //Homework 1
        System.out.println(word);
        int length = word.length();
        for(int i=0; i<length-1; i++){
            String word2="";
            for(int j=i+1; j<length; j++){
                char a = word.charAt(j);
                word2+=a;
            }
            System.out.println(word2);
        }

    }

    public void divNumber(String num){ //Homework 2
        int number;
        int length = num.length();
        do{
            number=0;
            for(int i=0; i<length; i++){
                char a = num.charAt(i);
                switch(a){
                    case'0': number+=0; break;
                    case'1': number+=1; break;
                    case'2': number+=2; break;
                    case'3': number+=3; break;
                    case'4': number+=4; break;
                    case'5': number+=5; break;
                    case'6': number+=6; break;
                    case'7': number+=7; break;
                    case'8': number+=8; break;
                    case'9': number+=9; break;
                    case'X': number*=10; number+=(int)(Math.random()*100); break;
                    case'Y': number*=10; number+=(int)(Math.random()*100); break;
                }
                number*=10;
            }
            number/=10;
            if(number%91==0) System.out.println(number);

        }while(number%91!=0);
    }



}
