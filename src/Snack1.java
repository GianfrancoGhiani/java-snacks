import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("insert a number");
        int userNum = Integer.parseInt(scan.nextLine());
        if ((userNum % 2) == 0){
            System.out.println(userNum);
        }else {
            System.out.println(userNum+1);
        }
    }
}
