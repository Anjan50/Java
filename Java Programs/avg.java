import java.util.*;
class avg
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n=sc.nextInt();
        int ar[] = new int[n];
        float avg;
        int sum=0;
        System.out.println("Enter the integers");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            sum=sum+ar[i];
        }
        avg=(float)sum/(float)n;
        System.out.println("The average is = "+avg);
    }
}