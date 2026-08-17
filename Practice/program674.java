import java.io.*;
import java.util.Scanner;


class program674
{
    public static void main(String a[])
    {
        String data = "Marvellous Infosystems";
        byte arr[] = data.getBytes();


        System.out.println(data.length());
        System.out.println(arr.length);
    
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
