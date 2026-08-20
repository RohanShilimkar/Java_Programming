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

}

class program713
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

        System.out.println("Number of of Words: "+iRet);
      
        sobj.close();
    }    
}
