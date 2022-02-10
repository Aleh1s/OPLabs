import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three coordinates of first vector: ");
        float a1 = scanner.nextInt(),
        a2 = scanner.nextInt(),
        a3 = scanner.nextInt();
        System.out.println("Write three coordinates of second vector: ");
        float b1 = scanner.nextInt(),
        b2 = scanner.nextInt(),
        b3 = scanner.nextInt();
        float firstDivision = a1/b1,
         secondDivision = a2/b2,
         thirdDivision = a3/b3;
        boolean result;
        if(firstDivision == secondDivision && firstDivision == thirdDivision){
            result = true;
        }
        else{
            result = false;
        }
        System.out.println(result);
    }
}
