public class Demo6_Task_b {
    public static void main(String[] args) {

        String name1 = "Alice";
        int age1 = 24;
        String name2 = "Bob";
        int age2 = 30;

        String frameColor = "\033[33m";
        String resetFrame = "\033[30;0m";
        String nameColor = "\033[34;1m";    // color for headings
        String resetName = "\033[32;0m";    // heading color reset
        String nameColor2 = "\033[35m";     // color for ages
        String resetName2 = "\033[32;0m";   // reset of ages color

        System.out.printf("%s+------------+-----+%s\n", frameColor, resetFrame);
        System.out.printf("%1$s|%2$s %3$s%4$s%5$s %6$6s%1$s|%2$s %3$s%7$s%5$s %1$s|%2$s\n", frameColor, resetFrame, nameColor, "NAME", resetName,"", "AGE");
        System.out.printf("%s+------------+-----+%s\n", frameColor, resetFrame);
        System.out.printf("%1$s|%2$s %3$-11s%1$s|%2$s  %4$s%5$d%6$s %1$s|%2$s\n", frameColor, resetFrame, name1, nameColor2,age1,resetName2);
        System.out.printf("%1$s|%2$s %3$-11s%1$s|%2$s  %4$s%5$d%6$s %1$s|%2$s\n", frameColor, resetFrame, name2, nameColor2,age2,resetName2);
        System.out.printf("%s+------------+-----+%s\n", frameColor, resetFrame);

    }
}
