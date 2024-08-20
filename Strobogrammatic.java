import java.util.*;
public class Strobogrammatic {
    static Map<Character,Character> pair=new HashMap<>();
    static{
        pair.put('0','0');
        pair.put('1','1');
        pair.put('8','8');
        pair.put('6','9');
        pair.put('9','6');
    }
    static boolean strobo(String num)
    {
        int n=num.length();
        for(int i=0,j=n-1;i<=j;i++,j--)
        {
            char left=num.charAt(i);
            char right=num.charAt(j);
            char mapping=pair.getOrDefault(left,'-');
            if(mapping=='-')
              return false;
            if(mapping!=right)
              return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        String num=sc.next();
        if(strobo(num))
         System.out.println("It is a Strobogrammatic number");
        else
         System.out.println("It is not a Strobogrammatic number");
    }
}
