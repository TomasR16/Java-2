import java.util.ArrayList;
import java.util.Scanner;

public class GetMax {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int getallen[] = { 1,14,22,6,78};
        System.out.println(getMax(getallen));
    }

    public static int getMax(int[] getallen) {
        int max = 0;
        for (int i =0; i < getallen.length; i++) {
            if (getallen[i] > max) {
                max = getallen[i];
            }
        }
        return max;
    }


}
