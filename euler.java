import java.util.*;
public class euler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(phi(n));
    }
    static int phi(int n)
    {
        int result=n;
        for(int p=2;p*p<=n;p++)
        {
            if(n%p==0)
            {
                while (n%p==0) 
                {
                    n/=p;    //  n=n/p
                }
                result=result-result/p;    //result-=result/p
            }
        }
        if(n>1)
        {
            result=result-result/n;
        }
        return result;
    }
    
}
