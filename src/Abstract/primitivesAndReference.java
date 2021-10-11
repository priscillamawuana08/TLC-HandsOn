package Abstract;

import java.sql.SQLOutput;

public class primitivesAndReference {

    public static void main(String[] args) {
        //primitive data type( In lower case)
    byte age = 20;
    //Non primitive data type AKA reference type( Always starts with Upper case)
        String name = new String("Priscilla");
        //Setting name to upper cases
        System.out.println(name.toUpperCase());
        // prints out the letter with index 2
        System.out.println(name.charAt(2));
        String ill = new String("ill");
        //This prints out a boolean of true because the word 'ill' can be found in the name 'Priscilla'
        System.out.println(name.contains(ill));
        //comparing weather  name is equal to ill
        System.out.println(name.equals(ill));



    }
}
