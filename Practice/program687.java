import java.io.*;
import java.util.Scanner;


class program687
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if(fobj.exists()  && fobj.isDirectory())
        {
            System.out.println("Folder Exists");

            File farr[] = fobj.listFiles();

            System.out.println("Number of Files in Folder: "+farr.length);
        }
        else
        {
            System.out.println("No such Folder");
        }
      
        
    }
}
