package sk.kosickaacademic.simon.polia;

public class Number {
    public boolean isBinaryNumber(int value){
        if(value<1) return false;
        while (value>0) {
            if ((value%10)!=0 && (value%10)!=1) { return false; }
            value/=10;
        }

        return true;
    }

    public boolean isOctalNumber(int value){
        if(value<1) return false;
        while (value>0) {
            if ((value%10)>7) { return false; }
            value/=10;
        }

        return true;
    }

    public boolean isHexadecimalNumber(String value){
        int number=1;
        int length = value.length();
        for(int i=length-1; i>=0; i--){
            char a = value.charAt(i);
            switch(a){
                case '0': number=0; break;
                case '1': number=1; break;
                case '2': number=2; break;
                case '3': number=3; break;
                case '4': number=4; break;
                case '5': number=5; break;
                case '6': number=6; break;
                case '7': number=7; break;
                case '8': number=8; break;
                case '9': number=9; break;
                case 'A': number=10; break;
                case 'B': number=11; break;
                case 'C': number=12; break;
                case 'D': number=13; break;
                case 'E': number=14; break;
                case 'F': number=15; break;
            }
            if(i==0 && number==0) return false;
        }

        return true;
    }

}
