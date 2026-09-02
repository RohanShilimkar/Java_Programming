//  Input   : 
//  Output  :  

import java.util.Scanner;



class program756
{
    public static boolean CheckAnagram(String str1,String str2)
     {
        
        return true;
    }

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;
        String str2 = null;
        char arr[] = null;
        int i=0;
    
        
        System.out.print("Enter first String: ");
        str2 = sobj.nextLine();
        
        System.out.print("Enter Second String: ");
        str2 = sobj.nextLine();

        boolean bret = false;

        bret = CheckAnagram(str1, str2);

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