import java.util.Scanner;

class User {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your First Num:");
        
        int new1 = sc.nextInt();
        
        System.out.println("Enter your First Num:");
        
        int new2 = sc.nextInt();
        
        int sum = new1 + new2;
        
        System.out.println("The total is: "+sum);
        
        sc.close();
        
    }
}
