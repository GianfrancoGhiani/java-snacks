import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        Random randNum = new Random();
        String[] names = {"Giorgio", "Carlo", "Mattia", "Laura", "Sofia", "Clara"};
        String[] surnames= {"Ferrari", "Li Causi", "Misseri", "Fasulo", "Pricoco", "Bassani"};
        System.out.println("Invites List:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[randNum.nextInt(names.length)]+" "+surnames[randNum.nextInt(surnames.length)]);
        }
    }
}
