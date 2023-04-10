import java.util.Scanner;

public class practical_1b {
    public static void main(String[] args) {
        int n;
        int i = 1;
        int fact=1;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1 ; i<=n; i++){
            fact= fact*i;
        }
        System.out.println("the factorial of "+ n+ " is" + fact);




    }
}
