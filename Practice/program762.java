//  Input   : 
//  Output  :  

import java.util.Arrays;
import java.util.Scanner;

class program762
{
    public static boolean CheckAnagram(String str1,String str2)
    {

        if(str1.length() != str2.length())
        {
            return false;
        }

        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        str1 = new String(arr);
        str2 = new String(brr);

        if(str1.equals(str2))
        {
            return true;
        }
        else{
            
            return false; 
        }

        
    }

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;
        String str2 = null;    
        
        System.out.print("Enter first String: ");
        str2 = sobj.nextLine();
        
        System.out.print("Enter Second String: ");
        str2 = sobj.nextLine();

        boolean bret = false;

        bret = CheckAnagram(str1,str2);

        if(bret == true)
        {
            System.out.println("Is Anagram");
            
        }
        else{
        System.out.println("Is not Anagram");
        }
        sobj.close();
         
    }
}