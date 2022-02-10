import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int[] p = {1,4,2,3,7,6,12,8,5,11};
        int d = sum(p);
        p = reduceByD(p, d);
        display(p,d);
    }
    private static int pMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            boolean isTrue = max < array[i];
            if(isTrue)
                max = array[i];
        }
        return max;
    }
    private static int sum(int[] p){
        int sum = 0;
        int pMax = pMax(p);
        for(int k = 1; k < p.length; k++){
            sum += pow((pMax - p[k]), 2);
        }
        return sum;
    }
    private static int[] reduceByD(int[] p, int d){
        for(int i = 0; i < p.length; i++){
            boolean isTrue = i % 2 != 0;
            if (isTrue)
                p[i] -= d;
        }
        return p;
    }
    private static void display(int[] result, int d){
        System.out.printf("d = %d\n", d);
        for(int a : result) System.out.printf("%d, ", a);
    }
}
