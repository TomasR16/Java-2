import java.util.ArrayList;

public class Opdracht1nieuw {
    public static void main(String[] args) {
        String bereken = "4+6+9/3";
        int opertratorscount = 0;
        ArrayList<Character>operators = new ArrayList<>();
        for(int i=0; i < bereken.length(); i++) {
            if (bereken.charAt(i) == '+' || bereken.charAt(i) == '-' || bereken.charAt(i) == '*' || bereken.charAt(i) == '/') {
                opertratorscount++;

                operators.add(bereken.charAt(i));
            }
        }
            System.out.println("");
            System.out.println("Return vallue: ");

            String[] var = bereken.split("\\+|\\-|\\*|\\/", opertratorscount +1);


            int num1 = Integer.parseInt(var[0]);
            int num2 = 0;
            int j = 0;
            for (int i =1; i< var.length; i++){
                num2 = Integer.parseInt(var[i]);
                char operator = operators.get(j);
                if (operator == '+'){
                    num1 = num1 + num2;
                }
                else if (operator == '-'){
                    num1 = num1 - num2;
                }
                else if (operator == '/'){
                    num1 = num1 / num2;
                }

                else{
                    num1 =  num1 * num2;
                }
                j++;
            }
        System.out.println(num1);
        }
    }

