import java.util.Scanner;

public class HW_Conditions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        if (x == 7) {
            System.out.println("You number is 7");
        } else {
            System.out.println("You number is not 7");
        }
    }
}