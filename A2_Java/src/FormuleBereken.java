public class FormuleBereken {

    static Integer bereken(String formule) {
        //String Operator bepaald de rekenvolgorde
        String[] operator = {"*", "+", "-"};
        System.out.println("Formule: " + formule);
        Integer resultaat = 0;
        if (formule.contains("(")) {
            int teken = formule.indexOf('('); //kijken of er een haak in formule zit
            int teken2 = formule.indexOf(')');
            String sGetal = formule.substring(teken + 1, teken2);
            System.out.println("teken = " + teken + ", teken = " + teken2 + " , " + sGetal);
            resultaat = FormuleBereken.bereken(sGetal);
            //nieuwe formule berekenen
            String nwFormule = "";

            //zet eventueel het  eerste stuk van de formule er weer voor
            if (teken > 0) {
                nwFormule = formule.substring(0, teken);
            }
            nwFormule = nwFormule + Integer.toString(resultaat) + formule.substring(teken2 + 1);

            resultaat = FormuleBereken.bereken(nwFormule);
        } else {
            //array met tekens
            //for loop die door heen gaat
            for (int i = 0; i < operator.length; i++) {
                if (formule.contains(operator[i])) {
                    int teken = formule.indexOf(operator[i]);
                    int startIndex = teken -1;
                    while ((formule.charAt(startIndex) != '-') && (formule.charAt(startIndex) != '+') && (formule.charAt(startIndex) != '*') && (startIndex > 0)) {

                        startIndex--;
                    }
                    if(hasOperator(Character.toString(formule.charAt(startIndex)))){
                        startIndex++;
                    }
                    String getal1 = formule.substring(startIndex , teken);

                    int eindIndex = teken + 1;
                    System.out.println("teken = " + teken);
                    while (((eindIndex < formule.length())&&(formule.charAt(eindIndex) != '-') && (formule.charAt(eindIndex) != '+') && (formule.charAt(eindIndex) != '*'))) {
                        eindIndex++;
                        System.out.println("eind index = " + eindIndex );
                        System.out.println("start index = " + startIndex);
                    }

                    String getal2 = formule.substring(teken+1, eindIndex);
                    System.out.println(getal1);
                    System.out.println(getal2);

                    if (operator[i].equals("*")) {
                        resultaat = Integer.parseInt(getal1) * Integer.parseInt(getal2);
                    } else if (operator[i].equals("+")) {
                        resultaat = Integer.parseInt(getal1) + Integer.parseInt(getal2);
                    } else if (operator[i].equals("-")) {
                        resultaat = Integer.parseInt(getal1) - Integer.parseInt(getal2);
                    }

                    String nwFormule = "";
                    if (startIndex > 0) {
                        nwFormule = formule.substring(0, startIndex);
                    }
                    nwFormule = nwFormule + Integer.toString(resultaat) + formule.substring(eindIndex);

                    if (hasOperator(nwFormule)){
                        resultaat = FormuleBereken.bereken(nwFormule);
                    } else {
                        resultaat = Integer.parseInt(nwFormule);
                    }
                    return resultaat;
                }
            }
        }
        return resultaat;
    }


    public static boolean hasOperator(String formule) {
        boolean resultaat = false;

        resultaat = formule.contains("*") || formule.contains("+") || formule.contains("-");

        return resultaat;
    }
}


