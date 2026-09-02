//  Input   my name is rohan
//  Output: My Name Is Rohan

//  Input   my NAME is RohAn
//  Output: My Name Is Rohan

import java.util.Scanner;

class program742
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

        str = str.toLowerCase();

        arr = str.toCharArray();
 
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] == ' ')
            {
                if(arr[i+1] >= 'a'  && arr[i+1]<='z')
                {
                    arr[i+1] = (char)(arr[i+1] - 32);
                }
            }
            
        }
        
        String Output = new String(arr);
        System.out.println("Updated String is"+Output);
        

      
        sobj.close();
         
    }
}