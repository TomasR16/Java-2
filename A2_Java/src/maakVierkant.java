import java.util.Scanner;

public class maakVierkant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat voor aantal wilt u?");
        int aantal = scanner.nextInt();
        Vierkant(aantal);
    }

    private static void Vierkant(int keren) {

        for (int i = 0; i < keren; i++){
            for (int x = 1; x < keren; x++){
                System.out.print("+");
            }
            System.out.println("+");
        }
    }


}
