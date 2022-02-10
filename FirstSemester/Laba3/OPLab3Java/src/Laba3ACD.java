import java.util.Scanner;

public class Laba3ACD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double x, xn_1, e = 0.00001f, a = scanner.nextFloat();
            if(a > 0) {
                x = a / 2;
                xn_1 = 0.5f * (x + a / x);
                do {
                    x = xn_1;
                    xn_1 = 0.5f * (x + a / x);
                }
                while (Math.abs(xn_1 - x) > e);
                System.out.println("Result: " + xn_1);
            }
            else{
                System.out.println("The input number should be more than 0 !!!");
            }
        }
    }
}
