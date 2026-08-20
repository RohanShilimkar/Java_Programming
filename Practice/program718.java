import java.util.Scanner;

class StringX
{
    int CountWords(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        return tokens.length;
    }

    void DisplayWords(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i=0;i<tokens.length;i++)
        {
            System.out.println(tokens[i] +" : "+ tokens[i].length());
        }
    }

    void LargestWord(String str)
    {
        int imax = 0;
        String temp = null;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i=0;i<tokens.length;i++)
        {
          if(tokens[i].length() > imax)
          {
            imax = tokens[i].length();
            temp = tokens[i];
          }

          
        }
        System.out.println("Largest word length is: "+ imax);
        System.out.println("Largest word is: "+temp);

    }

    int Pattern(String str,String word)
    {
        int iCount = 0;
        String temp = null;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i=0;i<tokens.length;i++)
        {
            if(word.equals(tokens[i]))
            {
                iCount++;
            }  
        }

        System.out.println("Largest word is: "+temp);

        return iCount;
    }

}

class program718
{
    public static void main(String[] args) 
    {
        
        Scanner sobj = new Scanner(System.in);
        int iRet =  0;

        String str = null;

        System.out.println("Enter String");
        str = sobj.nextLine();

        StringX strobj = new StringX();
        
        iRet = strobj.CountWords(str);

        System.out.println("No. of Words: "+iRet);
        
        strobj.DisplayWords(str);
        strobj.LargestWord(str);
        
        iRet = strobj.Pattern(str,"are");
        
        System.out.println("Frequency is: "+iRet);
        sobj.close();
        
    }    
}