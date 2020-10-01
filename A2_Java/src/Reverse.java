import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse String!");
        String niks = scanner.nextLine();
        String r = reverseString(niks);
        System.out.println("Omgekeerd: "+r);
    }

    public static String reverseString(String tekst) {
        String resultaat = "";
        for (int i = tekst.length()-1; i>=0; i--){
            resultaat = resultaat + tekst.charAt(i);
        }
        return resultaat;
    }
}
