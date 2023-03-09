public class Snack3 {
    public static void main(String[] args) {
    int[] arrayInt = {1,2,3,3,2,3,3,3,2,3,2};
    int sum =0 ;
    for (int i = 1; i < arrayInt.length; i+=2) {
        sum+=arrayInt[i];
    }
    System.out.println(sum);
    }
}
