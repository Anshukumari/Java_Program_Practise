import java.util.Scanner;

public class NeonNumber {
    static boolean IsNeonNumber(int n)
    {
        int square = n*n;
        int sum=0;
        while(square>0)
        {
            int a = square%10;
            sum +=a;
            square/=10;
        }
        if(n==sum)
        {
            return true;
        }
        else
            return  false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       System.out.println(IsNeonNumber(n)?n+ " Number is Neon": n+ " Number is not Neon");
    }
}

