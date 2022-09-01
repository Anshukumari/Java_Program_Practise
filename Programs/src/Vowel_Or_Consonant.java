import java.util.Scanner;

public class Vowel_Or_Consonant {
    static String Vowel_Or_Consonant(char c) {
        String vowel="aeiouAEIOU";
        return (vowel.indexOf(c)!=-1)?"Vowel":"Consonant";

        /*if(c=='a'||c=='e'||c=='i'|| c=='o'|| c=='u'||
        c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
        {
            System.out.println("It is vowel ");
        }
        else
            System.out.println("It is consonant");*/
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(Vowel_Or_Consonant(ch));
    }
}
