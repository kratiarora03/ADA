import java.util.Scanner;

public class practical_1a {
    public static void main(String[] args) {
        int fact =1;
        int res = 1;
        System.out.println("enter the number -");
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        if( factorial <0)
            System.out.println("the number is negative");

        else {
            for(fact=1;fact<=factorial;fact++) {
                res = res * fact;
            }
                System.out.println("factorial of " +factorial +" is = "+res);



            }
        }



    }

