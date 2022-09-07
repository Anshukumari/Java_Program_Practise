import java.util.Scanner;

public class ReverseTheString {
    public static String reverse(String string)
    {
        String str="";
        for(int i=string.length()-1;i>=0;i--)
        {
            str += string.charAt(i);
        }
        return str;
    }

    public static String reverse2(String string)
    {
        StringBuilder str=new StringBuilder();
        for(int i=string.length()-1;i>=0;i--)
        {
            str.append(string.charAt(i));
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str.length());
        System.out.println(reverse(str));
        System.out.println(reverse2(str));
    }
}
