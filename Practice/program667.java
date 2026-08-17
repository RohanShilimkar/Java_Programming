import java.io.*;


class program667
{
    public static void main(String a[]) 
    {
        FileReader frobj = null;
        
        try
        {

           frobj =  new FileReader("Demo.txt"); 
           System.out.println((char)frobj.read());
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
