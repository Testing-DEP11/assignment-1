public class Demo5 {
    public static void main(String[] args) {
        
        int num1 = 978;
        int num2 = 3;
        int num3 = 16;
        int num4 = 1484100;
        String num1Color = "\033[31m";
        String num2Color = "\033[32m";
        String num3Color = "\033[33m";
        String num4Color = "\033[34m";
        String resetColor = "\033[30;0m";

        System.out.printf("%s%d%9$s-%s%d%9$s-%s%d%9$s-%s%d%9$s\n", num1Color, num1, num2Color, num2, num3Color, num3, num4Color, num4, resetColor);
    }
}
