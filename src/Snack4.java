import java.util.Random;

public class Snack4 {
    public static void main(String[] args) {
        Random randNum = new Random();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5,6,7,8};
        int i = 0;
        System.out.println("the difference between these arrays is "+ (array2.length-array1.length));
        while (array2.length > array1.length+i){
            System.out.println(randNum.nextInt(10));
            i++;
        }
    }
}
