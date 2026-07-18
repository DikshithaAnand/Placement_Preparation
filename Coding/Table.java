import java.util.Scanner;

class Table {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num for tables: ");
        int new1 = sc.nextInt();
        
        for (int i = 1; i<=10; i++)
        {
            System.out.println(new1+"*"+i+"="+(new1*i));
        }
        
        sc.close();
    }
}
