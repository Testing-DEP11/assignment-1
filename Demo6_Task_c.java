public class Demo6_Task_c {
    public static void main(String[] args) {

        String city1 = "Los Angeles";
        String state1 = "California";
        int popCity1 = 3966936;

        String city2 = "\033[32mNew\033[34;0m York";
        String state2 = "\033[32mNew\033[34;0m York";
        int popCity2 = 8336817;

        String city = "\033[30;1mCITY\033[30;0m";
        String state = "\033[30;1mSTATE\033[30;0m";
        String population = "\033[30;1mPOPULATION\033[30;0m";
        String frameColor = "\033[33m";
        String resetFrame = "\033[30;0m";
        String popColor = "\033[35m";
        String popReset = "\033[33;0m";
        
        System.out.printf("%s+----------------+------------+------------+%s\n", frameColor, resetFrame);
        System.out.printf("%5$s|%5$s %s%2$11s%5$s|%5$s %3$s%2$6s%5$s|%5$s %4$s%2$1s%5$s|%5$s\n",city,"", state, population, frameColor, resetFrame);
        System.out.printf("%s+----------------+------------+------------+%s\n", frameColor, resetFrame);
        System.out.printf("%1$s|%2$s %3$s%4$4s%1$s|%2$s %5$s %1$s|%2$s %7$s%6$,d%4$2s%8$s%1$s|%2$s\n",frameColor, resetFrame, city1,"", state1, popCity1, popColor, popReset);
        System.out.printf("%1$s|%2$s %3$s%4$7s%1$s|%2$s %5$s%4$2s %1$s|%2$s %7$s%6$,d%4$2s%8$s%1$s|%2$s\n",frameColor, resetFrame, city2,"", state2, popCity2, popColor, popReset);
        System.out.printf("%s+----------------+------------+------------+%s\n", frameColor, resetFrame);
        
    }
}
