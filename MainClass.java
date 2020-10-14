package sk.kosickaacademic.simon.polia;

public class MainClass {
    public static void main(String[] args) {
        Number num = new Number();
        System.out.println(num.isBinaryNumber(1));
        System.out.println(num.isOctalNumber(1236478));
        System.out.println(num.isHexadecimalNumber("1F010ABC9"));
    }
}
