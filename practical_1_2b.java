public class practical_1_2b {
     static int n1=0;
   static int n2=1;
   static int n3;
    static void printFibonacci(int count){
        if(count >0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 7;
        System.out.println(n1+ " " +n2);
        printFibonacci(count-2);
    }
}
