import java.io.*;


class program666
{
    public static void main(String a[]) 
    {
        FileReader frobj = null;
        
        try
        {

           frobj =  new FileReader("Demo.txt"); 
           System.out.println(frobj.read());
           frobj.close();         // imp
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
