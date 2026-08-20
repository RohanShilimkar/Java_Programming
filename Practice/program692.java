import java.io.*;
import java.util.Scanner;


class program692
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;
        
        System.out.println("Enter Folder Name:");
        FolderName = sobj.nextLine();
        
        System.out.println("Enter the Name of packed file:");
        PackFileName = sobj.nextLine();
        
        File fobjfolder = new File(FolderName);

        if(fobjfolder.exists()  && fobjfolder.isDirectory())
        {
            File fobjPack = new File(PackFileName);

            fobjPack.createNewFile();

            foobj = new FileOutputStream(fobjPack);
        
            // System.out.println("Folder Exists");

            File farr[] = fobjfolder.listFiles();
            
            for(int i=0;i<farr.length;i++)
            {
                fiobj = new FileInputStream(farr[i]);

                //Write Filename and size
                String str =  null;
                str = farr[i].getName() +" "+ farr[i].length()+ "\n";
                
                foobj.write(str.getBytes());
                
                //Loop                
                int iRet=0;
                while((iRet = fiobj.read()) != -1)
                {
                    foobj.write(iRet);
                }
            }
            
            System.out.println("Sucessfully Done!");
        }
        else
            {
            System.out.println("No such Folder");
        }
        
        fiobj.close();
        sobj.close();
    }
}

