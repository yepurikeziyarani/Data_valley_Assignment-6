import java.util.Scanner;
class MaximumElement
{
public static void main(String args [])
{
    int n, max;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }
    max=arr[0];
    for(int i=0;i<arr.length;i++)
   {
   if(arr[i]>max)
    {
    max=arr[i];
    }
    }
    System.out.println(max);
}
}
