import java.util.*;
import java.io.*;

/**
 * CreateFile
 */
public class CreateFile {

    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

             str= str.trim();

             System.out.println("String After trim :"+str);
        str = str.replaceAll("//s+", " ");

        System.out.println("String: "+str);


        String word[]= str.split(" ");

        for(int i =0; i <word.length; i++)
        {

        System.out.println(word[i]);
        }
    }
}