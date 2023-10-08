package Chapter_3_String.Chapter_3_Strings;

import java.util.Locale;

public class Methods_in_String {
    public static void main(String[] args) {
        String userName = "GAURAV";
        int value = userName.length();      //length of string gaurav = 6 from[0-5]
        System.out.println(value);


        String lowerCase = userName.toLowerCase();
        System.out.println(lowerCase);      //string is printed in lowercase


        String upperCase = lowerCase.toUpperCase();
        System.out.println(upperCase);      //string is printed in uppercase


        String nonTrimmerdString = "     Hi I Am Gaurav         "; //remove spaces from front and back
        System.out.println(nonTrimmerdString.trim());


        System.out.println(userName.substring(2));  //print from string's character
                                                              //index number(name.substring(index))

        System.out.println(userName.substring(2,4)); // print from index 2 - 4 means "UR" 4 value will not print


        System.out.println(userName.replace('A', 'C')); // replace old character
                                                                        // with new character
        System.out.println(userName.replace("GAU", "PAR")); //also use for string


        System.out.println(userName.startsWith("GAU")); //checks starts with char
        System.out.println(userName.endsWith("RAY"));   //checks end with char

        System.out.println(userName.charAt(0));     //print index position char

        System.out.println(userName.indexOf("A",2));  //tell the position index of the character in string
        String alpha = "abcdefghiuvwjklmnopqrstuvwxyz";
        System.out.println(alpha.lastIndexOf("uvw",21));

        System.out.println(userName.equalsIgnoreCase("Gaurav")); //to find the given string is equal to old string

    }
}
