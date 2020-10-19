package sk.kosickaacademic.simon.priklady;

public class Characters2 {
    public void textAnalyser(String text){
        int length = text.length();
        int uppercase=0, lowercase=0, numbers=0, spaces=0, sentences=0;
        char last='q';
        for(int i=0; i<length; i++){
            char a=text.charAt(i);
            if(a>='A' && a<='Z') uppercase++;
            else if(a>='a' && a<='z') lowercase++;
            else if(a>='0' && a<='9') numbers++;
            else if(a==' ') spaces++;
            else if((last!='.' && last!='!' && last!='?') && (a=='.' || a=='!' || a=='?')) sentences++;
            last=text.charAt(i);
        }
        System.out.println("uppercase: " +uppercase +" lowercase: " +lowercase +" numbers: " +numbers +" spaces: " +spaces +" sentences: " +sentences);

    }
}
