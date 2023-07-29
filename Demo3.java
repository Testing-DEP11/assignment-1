public class Demo3 {
    public static void main(String[] args) {

        int areaCode = 123;
        int num1 = 456;
        int num2 = 7890;
        String color = "\033[31m";
        String colorReset = "\033[31;0m";

        System.out.printf("Tel. Number = %s(%d)%s %d-%d\n", color, areaCode, colorReset, num1, num2);

    }
}
