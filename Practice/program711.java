class program710
{
    public static void main(String[] args) 
    {
        String header = "India  is  my  country";
        String Arr[] = header.split(" ");

        System.out.println("Number of Words: "+Arr.length);

        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
               
    }    
}