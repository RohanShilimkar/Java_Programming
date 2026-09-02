//  Input   : 
//  Output  :  

import java.util.Scanner;

class program760
{
    public static boolean CheckAnagram(String str1,String str2)
     {
        int i=0;
        boolean bFalg = true;

        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.trim();
        str1.replaceAll("\\s+"," ");
        str1 = str1.toLowerCase();
        char arr[] = str1.toCharArray();

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Frequency[(int)arr[i]-97]++;
            }
        }

        str2 = str2.trim();
        str2.replaceAll("\\s+"," ");
        str2 = str2.toLowerCase();
        char brr[] = str2.toCharArray();
        int Frequency[] = new int[26];

        for(i=0;i<brr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Frequency[(int)arr[i]-97]++;
            }
            if(brr[i]>='a' && brr[i]<='z')
            {
                Frequency[(int)brr[i]-97]--;
            }
        }

        
        return bFalg; 
        
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