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

}

class program714
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
      
        sobj.close();
        
    }    
}
