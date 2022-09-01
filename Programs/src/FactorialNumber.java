import java.util.Scanner;

public class FactorialNumber {
    static int Factorial(int num) {
        if(num==0||num==1)
            return 1;

        return num*Factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Factorial(num));
    }
}
