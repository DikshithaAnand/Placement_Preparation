import java.util.Scanner;

class Condition {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int new1 = sc.nextInt();
        System.out.println("Enter the second num: ");
        int new2 = sc.nextInt();
        
        if(new1 > new2){
            System.out.println("new1 is larger");
        }
        else{
            System.out.println("new2 is larger");
        }
        
        sc.close();
    }
}
