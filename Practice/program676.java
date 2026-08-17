import java.io.*;
import java.util.Scanner;


class program676
{
    public static void main(String a[]) throws Exception
    {
       Scanner sobj = new Scanner(System.in);
       File fobj = null;
       FileOutputStream foobj = null;

       System.out.println("Enter File Name:");
       String fname = sobj.nextLine();

        fobj = new File(fname);
        foobj = new FileOutputStream(fobj);

        String data = "Marvellous Infosystems";

        byte Arr[] = data.getBytes();

        if(fobj.exists())
        {

            foobj.write(Arr);   
            
        }
        else
        {
            System.out.println("File is not there");

        }





    }
}
