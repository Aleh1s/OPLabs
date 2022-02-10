import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello how is it going ?";
        String[] array = str.split(" ");
        array = deleteWords(array);
        String theLongestWord = theLongestWord(array);
        display(array, theLongestWord);
    }
    private static String[] deleteWords(String[] array){
        String[] result = new String[(int)(array.length / 2)];
        int counter = 1;
        for(int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result[i - counter] = array[i];
                counter++;
            }
        }
        return result;
    }
    private static String theLongestWord(String[] array){
        String max = array[0];
        for(int i = 1; i < array.length; i ++){
            if(max.length() < array[i].length())
                max = array[i];
        }
        return max;
    }
    private static void display(String[] array, String max){
        System.out.println("Масив зі словами, що стоять на непарних позиціях: " + Arrays.toString(array)    );
        System.out.printf("Найбільше слово з масиву: %s", max);
    }

}
