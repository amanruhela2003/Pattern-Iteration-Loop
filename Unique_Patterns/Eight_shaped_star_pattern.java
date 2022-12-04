package Unique_Patterns;

public class Eight_shaped_star_pattern {

    public static void main(String[] args) {
        int n=5;
         //8 star pattern
         for(int i=1;i<=2*n-1;i++)
         {
         for(int j=1;j<=n;j++)
         {
         if( (i==1 && (j==1 || j==n)) || (i==n && ( j==1 || j==n)) || (i==2*n-1 &&
         (j==1 || j==n)) )
         {
         System.out.print(" ");
         }
         else if( i==1 || i==n || i==2*n-1 || j==1 || j==n)
         {
         System.out.print("x");
 
         }
         else{
         System.out.print(" ");
         }
 
         }System.out.println();
         }
    }
    
}
