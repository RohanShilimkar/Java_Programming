//  Input   : 
//  Output  :  

import java.util.Scanner;



class program757
{
    public static boolean CheckAnagram(String str1,String str2)
     {
        int i=0;
        boolean bFalg = true;

        str1 = str1.trim();
        str1.replaceAll("\\s+"," ");
        str1 = str1.toLowerCase();
        char arr[] = str1.toCharArray();
        int Frequency1[] = new int[26];

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Frequency1[(int)arr[i]-97]++;
            }
        }

        str2 = str2.trim();
        str2.replaceAll("\\s+"," ");
        str2 = str2.toLowerCase();
        char brr[] = str2.toCharArray();
        int Frequency2[] = new int[26];

        for(i=0;i<brr.length;i++)
        {
            if(brr[i]>='a' && brr[i]<='z')
            {
                Frequency2[(int)brr[i]-97]++;
            }
        }

        for(i=0;i<Frequency1.length;i++)
        {
            if(Frequency1[i] != Frequency2[i])
            {
                bFalg = false;
                break;
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