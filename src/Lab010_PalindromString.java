import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab010_PalindromString {
    public static void main(String[] args) {

       String str = "naman";
       String newstr = "";

       int slength = str.length();

        for (int i = slength-1; i>=0 ; i--)
            newstr += str.charAt(i);
        if (str.equals(newstr)){

            System.out.println("String is palindrome");

        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }


}
