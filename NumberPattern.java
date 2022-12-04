public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        // 1
        // 01
        // 010
        // 1010
        // 10101
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(k);
                if (k == 1) {
                    k = 0;
                } else {
                    k = 1;
                }
            }
            System.out.println();
        }
        System.out.println();
        // 1
        // 131
        // 13531
        // 1357531
        // 135797531
        for (int i = 1; i <= n; i++) {
            k = 1;
            int m = 2 * i - 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= m / 2) {
                    System.out.print(k);
                    k = k + 2;
                } else {
                    System.out.print(k);
                    k = k - 2;
                }
            }
            System.out.println();
        }
        System.out.println();
        // 1 1
        // 12 21
        // 123 321
        // 1234 4321
        // 1234554321
        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
        System.out.println();
        // 1 1
        // 2 2
        // 3 3
        // 4 4
        // 5
        // 4 4
        // 3 3
        // 2 2
        // 1 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i == j || i + j == 2 * n + 1) {
                    System.out.print(i);

                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i == j || i + j == 2 * n + 1) {
                    System.out.print(i);

                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println();
        // 1
        // 123
        // 12345
        // 1234567
        // 123456789
        // 1234567
        // 12345
        // 123
        // 1
        for (int i = 1; i <= n; i++) {
            k = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(k);
                k++;
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            k = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(k);
                k++;
            }

            System.out.println();
        }
        System.out.println();
        // *
        // *1*
        // *121*
        // *12321*
        // *1234321*
        // *123454321*
        // *1234321*
        // *12321*
        // *121*
        // *1*
        // *
        System.out.println("*");
        for (int i = 1; i <= n; i++) {

            k = 1;
            int m = 2 * i - 1;
            System.out.print("*");
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= m / 2) {
                    System.out.print(k);
                    k = k + 1;
                } else {
                    System.out.print(k);
                    k = k - 1;
                }
            }System.out.print("*");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            k = 1;
            int m = 2 * i - 1;
            System.out.print("*");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= m / 2) {
                    System.out.print(k);
                    k = k + 1;
                } else {
                    System.out.print(k);
                    k = k - 1;
                }
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        System.out.println();
            
    
        }


    }


