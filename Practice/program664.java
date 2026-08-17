import java.io.*;
import java.util.Scanner;

class program664
{
    public static void main(String a[]) throws IOException
    {
        FileWriter fwobj = new FileWriter("Demo.txt");

        fwobj.write("Jay Ganesh...");

        fwobj.close();         // imp
    
    }
}
