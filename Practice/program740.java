//  Input   my name is rohan
//  Output: My Name Is Rohan

//  Input   my NAME is RohAn
//  Output: My Name Is Rohan

import java.util.Scanner;

class program740
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String Tokens[] = null;
        String temp = null;


        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();

        str = str.toLowerCase();

        


        System.out.println(str);
        

      
        sobj.close();
         
    }
}