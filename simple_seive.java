import java.util.*;
public class simple_seive 
{
    static void SimpleSeive(int n)
    {
        //Step1: Declare a boolean array of size n+1
        boolean bool[]=new boolean[n+1];
        //Step2: Initialize the bool array values as true from 2
        for(int i=2;i<=n;i++)
        {
            bool[i]=true;
        }
        //Step3: Mark all the multiples of first primes as false
        //Step4: Repeat step3 till square root of n
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            for(int j=i*i;j<=n;j+=i)
            {
                if(bool[i]==true)
                {
                    bool[j]=false;
                }
            }
        }
        //Print all the true values from the boolean array
        for(int i=2;i<=n;i++)
        {
            if(bool[i]==true)
              System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the number till where the primes should generated");
        int n=sc.nextInt();
        //Call the function to list all the primes till n
        SimpleSeive(n);
    }
    
}