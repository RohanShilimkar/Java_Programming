import java.io.*;

class program658
{
    public static void main(String a[]) 
    {
        try
        {
            File fobj = new File("Demo.txt");
            
            if(fobj.exists())
            {
                System.out.println("File Aready Exists");
            }
            else
            {
                fobj.createNewFile(); 
                System.out.println("File Gets Created Successfully");
            }

        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
                
    
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}
