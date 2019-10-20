import java.util.Scanner;

public class HW_Conditions2 {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

            if (a % 2 == 1) {
                System.out.println(a + " is odd");
            } else
                System.out.println(a + " is even");

    }
}