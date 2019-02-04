package fibonacci.series;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inj = new Scanner (System.in);
        System.out.print("Many terms of Fibonnaci Series : ");
        int fibo=inj.nextInt();
        int x = fibo-2;
        
        long a=0;
        long b=1;
        long c=0;
        int tot = 0;
        
        System.out.println("Fibonacci Series : ");
        for (int i=1; i<=x-1 ; i++){
        System.out.println(c);
        c=a+b;
        a=b; b=c;
        tot++;
            System.out.println(tot);
        }
        
        print(fibo-2);
    }
    static int n1=0,n2=1,n3=0,x=2;
    static void print(int count){
        if (count>0) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            x++;
            System.out.println(x + " ||||| " + n3);
            
            print(count-1);
        }
    }
    
}
