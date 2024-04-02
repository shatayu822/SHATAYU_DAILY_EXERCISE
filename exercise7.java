public class exercise7 
{
    public static void main(String args[])
    {
        int a[]={1,2,5,4,9,6,8,10,18,24,99,3};

        int ce=0;
        int co=0;

        for (int i : a)
        {
            if(i==0)
            {

            }
             else if(i%2==0)
            {
                ce++;
            }
            else
            {
                 co++;
            }
        }

        System.out.println("even numbers are: "+ce);
        System.out.println("odd numbers are: "+co);
    }
}
