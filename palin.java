import java.util.*;
public class palin {
    static boolean binaryPalindrome(int num)
    {
        int revnum=0;
        int copynum=num;
        while(copynum!=0)
        {
            revnum=(revnum<<1)|(copynum&1);
            copynum>>=1;
        }
        return (num==revnum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(binaryPalindrome(num))
          System.out.println("It is a Binary Palindrome");
        else 
          System.out.println("It is not a Binary Palindrome");


    }
}
