import java.io.*;
import java.util.Scanner;


class program679
{
    public static void main(String a[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       File fobj = null;
       FileInputStream fiobj = null;

       System.out.println("Enter File Name:");
       String fname = sobj.nextLine();

        fobj = new File(fname);
        fiobj = new FileInputStream(fobj);

        byte Arr[] = new byte[50];

        if(fobj.exists())
        {
            fiobj.read(Arr);
            String str = new String(Arr);

            System.out.println(str);
            
        }
        else
        {
            System.out.println("File is not there");

        }




    }
}
