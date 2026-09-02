//  Input   
//  Output: 

//  Input   
//  Output: 

import java.util.Scanner;

class program744
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();

        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb.reverse());

      
        sobj.close();
         
    }
}