import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if(size > 1) {
            int[][] matrix = new int[size][size];
            initializeMatrix(matrix, size);
            int max = matrix[0][0];
            display(matrix, size, max);
        }
        else
            System.err.println("Invalid data");
    }
        private static void initializeMatrix(int[][] matrix, int size){
            int x = size, y = size - 2, index = 0;
            while (x != 0 || y != 0) {
                while (y < size - 1 && x > 0 ) {
                    index += 1;
                    x -= 1;
                    y += 1;
                    putIndex(matrix, x, y, index);
                }
                index += 1;
                if (y == size - 1 && x > 0) {
                    x -= 1;
                } else {
                    y -= 1;
                }
                putIndex(matrix, x, y, index);
                while (x < size - 1 && y > 0) {
                    index += 1;
                    x += 1;
                    y -= 1;
                    putIndex(matrix, x, y, index);
                }
                index += 1;
                if (x == size - 1 && y > 0){
                    y -= 1;
                }
                else {
                    x -= 1;
                }
                putIndex(matrix, x, y, index);
            }
        }
    private static void putIndex (int[][] matrix, int x, int y, int index){
        matrix[y][x] = index;
    }
    private static void display(int[][] matrix, int size, int max){
        System.out.printf("Input data: %d\n", size);
        System.out.println("Matrix:");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("%4d\t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Max: %d", max);
    }
}
