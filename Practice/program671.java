import java.io.*;
import java.util.Scanner;


class program671
{
    public static void main(String a[]) 
    {
       Scanner sobj = new Scanner(System.in);
       File fobj = null;

       System.out.println("Enter File Name:");
       String fname = sobj.nextLine();

        fobj = new File(fname);

        if(fobj.exists())
        {
            System.out.println("FileName: "+fobj.getName());
            System.out.println("Absolute path: "+fobj.getAbsolutePath());
            System.out.println("File Size: "+fobj.length());
        }
        else
        {
            System.out.println("File is not there");

        }





    }
}
