public class Pat {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if ( i==j || i+j==n+1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

        for(int i =0;i<n;i++){
            for(int j =n-i;j>0;j--)
            {
                System.out.print(" ");
            }

            for(int k=0;k<2*(i)+1;k++)
            {
                if(k==0||k==(2*i)||i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
