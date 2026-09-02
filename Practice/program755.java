//  Input   : 
//  Output  :  

import java.util.Scanner;

class program755
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


        str = str.toLowerCase();

        arr = str.toCharArray();

        int Frequency[] = new int[26];

        // a   b  c  d
        // 97 
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                Frequency[(int)arr[i]-97]++;
            }
        }

        System.out.println("Frequency of each letter is : ");

        int max = 0;
        char ch = '\0';

        for(i=0;i<Frequency.length;i++)
        {
            if(Frequency[i] > max)
            {
                max = Frequency[i];
                ch = (char)(i+97);
            }
        }

        
        System.out.println("Max occuured character is: "+ch+" with frequency: "+max);

        sobj.close();
         
    }
}