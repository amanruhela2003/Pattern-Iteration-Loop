// Enter the no. :
// 5

// 555555555
// 544444445
// 543333345
// 543222345
// 543212345
// 543222345
// 543333345
// 544444445
// 555555555

//=================================================================================
import java.util.Scanner;

public class Pattern_Hard
{
public static void main(String[] args) 
{
 System.out.println("Enter the no. :");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();

 int m=n;
 for(int i=1;i<=n;i++)
 {
    m=n;
    for(int j=1;j<2*n;j++)
    {
        if(j<i)
        {
            System.out.print(m);
            m=m-1;
        }
        else if(j>=2*n-i+1)
        {
            m=m+1;
            System.out.print(m);
        }
        else
        {
            System.out.print(n+1-i);
        }

    }
    System.out.println();
    
 }
 for(int i=n-1;i>0;i--)
 {
    m=n;
    for(int j=1;j<2*n;j++)
    {
        if(j<i)
        {
            System.out.print(m);
            m=m-1;
        }
        else if(j>=2*n-i+1)
        {
            m=m+1;
            System.out.print(m);
        }
        else
        {
            System.out.print(n+1-i);
        }

    }
    System.out.println();
    
 }
 sc.close();
}
}