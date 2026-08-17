import java.io.*;
import java.util.Scanner;


class program678
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

            System.out.println(new String(Arr));
            
        }
        else
        {
            System.out.println("File is not there");

        }




    }
}
