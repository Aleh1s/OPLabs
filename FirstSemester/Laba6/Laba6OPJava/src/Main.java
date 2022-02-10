import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt();
        boolean isNaturalNumbers = a > 0 && b > 0 && n > 0;
        if (isNaturalNumbers){
            float result = integral(n) + integral(a, b, n);
            System.out.printf("a = %d b = %d n = %d Result = %,f", a, b, n, result);
        }else
            System.err.println("Invalid numbers");
    }
    private static float h (int a, double b, int n){
        return (float) (b - a) / n;
    }
    private static float integral (int n){
        float sumOfFunctions = 0f;
        float h = h(0, PI, n);
        for(int i = 1; i <= n; i ++){
            float xi = 0 + i * h - h / 2;
            sumOfFunctions += log(2 + sin(xi));
        }
        return h * (sumOfFunctions);
    }
    private static float integral (int a, int b, int n){
        float sumOfFunctions = 0;
        float h = h(a, b, n);
        for(int i = 1; i <= n; i ++){
            float xi = a + i * h - h / 2;
            sumOfFunctions += pow(atan(xi),2);
        }
        return h * (sumOfFunctions);
    }
}
