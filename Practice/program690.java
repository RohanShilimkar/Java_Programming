import java.io.*;
import java.util.Scanner;


class program690
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        System.out.println("Enter the Name of packed file:");
        PackFileName = sobj.nextLine();
        
        File fobjfolder = new File(FolderName);

        if(fobjfolder.exists()  && fobjfolder.isDirectory())
        {
            File fobjPack = new File(PackFileName);

            fobjPack.createNewFile();

            System.out.println("Folder Exists");

            File farr[] = fobjfolder.listFiles();

            for(int i=0;i<farr.length;i++)
            {
              //Logic
            }

        }
        else
        {
            System.out.println("No such Folder");
        }        
    }
}

