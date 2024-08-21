import java.util.*;
public class crt {
    static int crt1(int a[],int m[],int p,int n)
    {
        int result=0;
        for(int i=0;i<n;i++)
        {
            int y=0;
            int M=p/m[i];
            for(int j=0;j<m[i];j++)
            {
                if((M*j)%m[i]==1)
                {
                    y=j;
                    break;
                }
            }
            result+=a[i]*M*y;
        }
        return result%p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m[]=new int[n];
        int p=1;
        for(int i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
            p=p*m[i];
        }
        System.out.println(crt1(a,m,p,n));
    }
}
