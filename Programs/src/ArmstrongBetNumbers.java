public class ArmstrongBetNumbers {
    static void ArmstrongBetNumbers(int l,int h)
    {
        for(int i=l+1;i<h;i++)
        {
            // count the number of digit
            int y=i;
            int n=0;
            while(y!=0)
            {
                y/=10;
                n++;
            }

            y=i;
            int sum=0;
            while(y!=0)
            {
                int a = y%10;
                sum +=Math.pow(a,n);
                y/=10;
            }
            if(sum==i)
            {
                System.out.println(" "+i);
            }

        }
    }
    public static void main(String[] args) {
        ArmstrongBetNumbers(50,500);
    }
}
