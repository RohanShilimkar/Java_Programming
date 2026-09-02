//  Input   : 
//  Output  :  

import java.util.Scanner;

class program753
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        char arr[] = null;
        int i=0;
    
        
        System.out.print("Enter String: ");
        str = sobj.nextLine();

        str = str.trim();
        str.replaceAll("\\s+"," ");


        arr = str.toCharArray();

        int Frequency[] = new int[26];

        // a b c d
        //
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Frequency[(int)arr[i]-97]++;
            }
        }

        System.out.println("Frequency of each letter is : ");

        for(i=0;i<Frequency.length;i++)
        {
            System.out.println((char)(i+97)+" : "+Frequency[i]);
        }


        sobj.close();
         
    }
}