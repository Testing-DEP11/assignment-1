public class Demo4 {
    public static void main(String[] args) {

        String monthColor = "\033[31m";
        String dateColor = "\033[32m";
        String yearColor = "\033[33m";
        String hourColor = "\033[34m";
        String minuteColor = "\033[35m";
        String secColor = "\033[36m";
        String resetColor = "\033[31;0m";

        System.out.printf("%s%d%13$s/%s%d%13$s/%s%d%13$s %s%d%13$s:%s%d%13$s:%s%d%13$s\n", monthColor,12,dateColor,28,yearColor,2023,hourColor,23,minuteColor,59,secColor,59,resetColor);

    }
}
