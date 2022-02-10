import java.util.Scanner;
import  static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float aInp = scanner.nextFloat(), bInp = scanner.nextFloat();
        int a, b, sum, n, divider, max = 0, min = 0 ;
        if(aInp < 1 && bInp < 1 ) {
            System.out.println("Invalid numbers");
            System.exit(0);
        }
        else if(aInp < 1)
            aInp = 1;
        else if(bInp < 1)
            bInp = 1;
        a = (int) ceil(aInp);
        b = (int) floor(bInp);
        boolean difference = (aInp - bInp) == 0;
        boolean absDifference = abs(a - b) < 0;
        if( difference && a > b){
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        else if(absDifference) {
            System.err.println("Invalid numbers");
            System.exit(0);
        }
        else if(a == b){
            min = a;
            max = b;
        }
        else {
            min = min(a, b);
            max = max(a, b);
        }
        while (min <= max) {
                sum = 0;
                n = 0;
                for (int i = 1; i <= min; i++) {
                    if (min % i == 0) {
                        divider = i;
                        sum += i;
                        n++;
                        System.out.println("дільник числа " + min + ": " + divider);
                    }
                }
                System.out.print("Кількіть дільників числа " + min + " - " + n + "\n"
                        + "Сума дільників числа " + min + " = " + sum + "\n");
                min++;
            }
        }
    }

