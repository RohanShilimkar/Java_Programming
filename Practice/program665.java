import java.io.*;


class program665
{
    public static void main(String a[]) 
    {
        FileWriter fwobj = null;
        
        try
        {

           fwobj =  new FileWriter("Demo.txt"); 
           fwobj.write("Jay Ganesh...");
           fwobj.close();         // imp
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        finally
        {

        }
            
    
    }
}
