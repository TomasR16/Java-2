public class Eindopdracht_2 {
    public static char[] weg = {'"', '?' ,'*','®'}; //een array gevuld met chars
    public static void main(String[] args) {


        String tekst =
                "Dit is een tekst met \" en ** en ?? "+
                        "en allerlei andere niet wenselijke tekens zoals ® etc. "; //een String vol met teskt en chars die weg moeten


        String resultaat = Wegwezen.bereken(tekst); //resultaat is bij wegwezen ingevuld en uitgevoerd

        System.out.println(resultaat); // printen van resultaat
    }

}
