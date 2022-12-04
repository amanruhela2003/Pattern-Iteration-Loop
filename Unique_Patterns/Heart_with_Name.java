package Unique_Patterns;

public class Heart_with_Name {
    public static void main(String[] args) {
        int n=10;
        String str="Aman Ruhela"; //Name in middle of heart
        int len=str.length();
        //HEART SHAPED STAR PATTERN
        
        
        for (int i =n/2; i <= n; i=i+2) {
            for (int j = 1; j < n-i; j=j+2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) 
        {
            for (int j = i; j < n; j++) 
            {
                System.out.print(" ");
            }
            if(i==n)
            {
             for(int j=1;j<=(2*n-len)/2;j++)
             {
                System.out.print("*");
             }
             System.out.print(str);
             for(int j=1;j<(2*n-len)/2;j++){
                System.out.print("*");
             }
    
            }
            else
            {
            for (int j = 1; j <= 2*i-1; j++) 
            {
                System.out.print("*");
            }
            }
            System.out.println();
        }
    }
    
}
