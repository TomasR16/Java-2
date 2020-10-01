public class Test {

    public boolean containsNumbers(String tekst){ //methode public boolean genaamd containsNumbers String tekst
        boolean resultaat = false; // resultaat staat op false
        for (char i = '0'; i <= '9'; i++){

//            for(int j= 0; j<tekst.length(); j++) {
//                if (tekst.charAt(j) == i) {
//                    resultaat = true;
//                }
//            }
            if (tekst.indexOf(i)>=0) { //als voorwaarde voldoed dan word resultaat true
                resultaat = true;
            }
        }
        return resultaat;
    }


    public boolean containsplus (String operator){
        if (operator.indexOf('+')>=0){
            return true;
        }
        else return false;
    }

    public String getNumbers (String numbs){
        String resultaat = "";
        for (int i =0; i < numbs.length(); i++) {
            if (containsNumbers(numbs.substring(i,i+1))) {
                resultaat = resultaat + numbs.substring(i,i+1);
            }
        }
        return resultaat;
    }


    public double countDecimals (double decimaal){
        //for (int i =0; i<decimaal; i++){
            double d= decimaal;

            String text = Double.toString(Math.abs(d));
            System.out.println("text = " + text);
            int integerPlaces = text.indexOf('.');
            System.out.println("Integer places = " +integerPlaces);
            int decimalPlaces = text.length() - integerPlaces - 1;
            System.out.println("Text length = " + text.length());
            System.out.println("decimalplaces = " +decimalPlaces);
        //}
        return decimalPlaces;
    }

}
