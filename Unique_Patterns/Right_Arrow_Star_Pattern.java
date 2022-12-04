package Unique_Patterns;

public class Right_Arrow_Star_Pattern {
    public static void main(String[] args) {
        int n = 5;
        //Right_arrow_star_pattern
        for(int i=1;i<=n;i++)
        {
        for(int k=1;k<=2*i-2;k++)
        {
        System.out.print(" ");
        }
        for(int j=n;j>=i;j--)
        {
        System.out.print("*");
        }
        System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
        for(int k=1;k<=2*n-2*i;k++)
        {
        
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
        System.out.print("*");
        }
        System.out.println();
        }
        
    }
    
}
