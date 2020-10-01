public class Wegwezen {

    public static String bereken(String tekst) {
        // Stap 0: haal de verboden tekens op uit eindopdracht_2
        char[] test = Eindopdracht_2.weg;

        // Stap 1: maak een array van de zelfde lengte als de string van tekst.
        char[] proef = new char[tekst.length()];

        // Stap 2: vul de array met de inhoud van de string.
        for (int x = 0; x < tekst.length(); x++) {
            proef[x] = tekst.charAt(x);
        }

        // Stap 3: controleer elk teken in de array proef op de verboden tekens die eruit moeten worden gehaald.
        for (int i = 0; i < proef.length; i++) {
            for (int j = 0; j < test.length; j++) {
                if (proef[i] == test[j]) {
                    proef[i] = ' ';
                }
            }
        }

        // Stap 4: Zet de array weer terug om in een string.
        String antwoord = new String(proef);
        return antwoord;
    }

}
