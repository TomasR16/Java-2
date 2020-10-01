public class Voorbeeld {
    public static void main(String[] args) {
            int dobbel;
            dobbel = gooiDobbelsteen();
            String scoop;
            scoop = verhaal();
            System.out.println(dobbel + "\t" + scoop);
    }

    private static int gooiDobbelsteen(){
        return (int) (1 + 6 * Math.random());
    }
    private static String verhaal(){
        return (String) ("Tomas");
    }
}
