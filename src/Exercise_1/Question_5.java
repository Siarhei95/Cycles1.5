package Exercise_1;
import java.util.Scanner;

public class Question_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        double sum = 0;
        double x = 1; double y = 1;
        double z = 1/x + 1/y;
        while (Math.abs(z)>=e) {
            sum = sum + z;
            x = 2*x; y = 3*y;
            z = 1/x + 1/y;
        }
        System.out.println(sum);
    }
}
