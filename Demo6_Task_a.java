public class Demo6_Task_a {
    public static void main(String[] args) {

        String backgroundColor1 = "\033[41m";   // for red color
        String backgroundColor2 = "\033[42m";   // for green color 
        String backgroundReset = "\033[41;0m";
        
        System.out.printf("%s[%4s5%s%s0%%%3s]%s\n",backgroundColor1,"",backgroundReset,backgroundColor2,"", backgroundReset);

    }
}
