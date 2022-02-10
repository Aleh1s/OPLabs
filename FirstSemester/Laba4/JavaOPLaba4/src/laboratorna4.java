import java.util.Scanner;

public class laboratorna4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a,b,Sum = 0;
        if(n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    a = i / 2;
                    b = i + 7;
                } else {
                    a = i;
                    b = Math.pow(i, 2);
                }
                Sum += Math.pow((a - b), 2);
            }

            System.out.println(Sum);
        }
    }
}
