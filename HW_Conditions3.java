import java.util.Scanner;

public class HW_Conditions3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a,b and r: ");

        int a = s.nextInt();
        int b = s.nextInt();
        int r = s.nextInt();

        if (r >= Math.sqrt(a * a + b * b) / 2)
            System.out.println("Прямоугольное отверстие закроется кругом");
        else
            System.out.println("Прямоугольное отверстие не закроется кругом");

    }
}
