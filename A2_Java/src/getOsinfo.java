import java.lang.*;
public class getOsinfo {
    public static void main(String[] args) throws Exception{
        for (Object propertyKeyName: System.getProperties().keySet()){
                System.out.println(propertyKeyName + " - " + System.getProperty(propertyKeyName.toString()));
            }
        }
         



}
