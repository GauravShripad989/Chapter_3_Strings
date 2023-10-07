package Chapter_3_String.Chapter_3_Strings;
import java.util.Scanner;

public class Intro_String {
    public static void main(String[] args) {
        String name = new String("Gaurav"); //String is a class but we can also use as
        String last_Name = "Shripad";              //a datatype
        System.out.println(name + " " + last_Name);//String are immutable means you cannot
                                                   //change the same String by any property
                                                   //just make a copy and do it
        int a = 50;
        float b = 23.36548f;
        System.out.printf("value of a is %d and value of b is %f \n", a, b);

        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.format(userName);
    }
}
