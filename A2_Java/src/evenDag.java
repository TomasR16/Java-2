import java.util.Calendar;
import java.time.LocalDate;

public class evenDag {
    public static void main(String[] args) {
         var now = LocalDate.now();
        System.out.println(now);
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        System.out.println(weekdag(day));


    }

    private static boolean weekdag (int day){
        boolean Beven = false;
        if((day%2)==0){
            System.out.println("Datum is Even " + day);
            Beven = true;
        }
        else{
            System.out.println("Datum is Oneven " + day);
            Beven = false;
        }
        return Beven;
    }

}
