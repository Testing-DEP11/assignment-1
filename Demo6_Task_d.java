public class Demo6_Task_d {
    public static void main(String[] args) {
        String item1 = "Apple";
        int qty1 = 5;
        double price1 = 0.99;

        String item2 = "Orange";
        int qty2 = 10;
        double price2 = 1.49;

        String item = "\033[30;1mITEM\033[30;0m";
        String quantity = "\033[30;1mQUANTITY\033[30;0m";
        String price = "\033[30;1mPRICE\033[30;0m";
        String frameColor = "\033[33m";
        String resetFrame = "\033[30;0m";
        String priceColor = "\033[35m";
        String priceReset = "\033[33;0m";
        String quantityColor = "\033[34m";
        String quantityReset = "\033[35;0m";
        String green = "\033[32m";

        
        System.out.printf("%s+---------+----------+-------+%s\n", frameColor, resetFrame);
        System.out.printf("%1$s|%2$s %3$s%6$3s %1$s|%2$s %4$s %1$s|%2$s %5$s %1$s|%2$s\n", frameColor, resetFrame, item, quantity, price, "");
        System.out.printf("%1$s+%2$s---------%3$s%1$s+----------+%4$s%2$s-------%3$s%1$s+%4$s\n", frameColor, green, quantityReset, resetFrame);
        System.out.printf("%1$s|%2$s %3$-7s %1$s|%2$s %8$s%4$8d%9$s %1$s|%2$s \033[32m$\033[32;0m%6$s%5$4.2f%7$s %1$s|%2$s\n", frameColor, resetFrame,item1, qty1, price1, priceColor, priceReset, quantityColor, quantityReset);
        System.out.printf("%1$s|%2$s %3$-7s %1$s|%2$s %8$s%4$8d%9$s %1$s|%2$s \033[32m$\033[32;0m%6$s%5$4.2f%7$s %1$s|%2$s\n", frameColor, resetFrame,item2, qty2, price2, priceColor, priceReset, quantityColor, quantityReset);
        System.out.printf("%1$s+%2$s---------%3$s%1$s+----------+%4$s%2$s-------%3$s%1$s+%4$s\n", frameColor, green, quantityReset, resetFrame);
        
    }
}
