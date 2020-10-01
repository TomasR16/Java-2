public class Oefening6 {
    public static void main(String[] args) {
        int geteld = countChar("aantal", 'q');
        System.out.println("Geteld is "+geteld);
    }

    public static int countChar(String tekst, char letter){
        int count =0;
        for (int i = 0; i <tekst.length(); i++){
            if (tekst.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
