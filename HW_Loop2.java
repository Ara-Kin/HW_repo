public class HW_Loop2 {
    public static void main(String[] args) {

        int count = 1;
        int result = 1;

        while (count < 11) {

            result *= count;
            count++;
        }
        System.out.println("Factorial of 10: " + result);
    }
}