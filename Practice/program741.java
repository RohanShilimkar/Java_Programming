//  Input   my name is rohan
//  Output: My Name Is Rohan

//  Input   my NAME is RohAn
//  Output: My Name Is Rohan

import java.util.Scanner;

class program741
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String Tokens[] = null;
        char arr[] =null;


        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        arr = str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
              
        

      
        sobj.close();
         
    }
}