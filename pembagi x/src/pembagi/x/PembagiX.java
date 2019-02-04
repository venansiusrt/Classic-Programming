package pembagi.x;

import java.util.Scanner;
public class PembagiX {
    public static void main(String[] args) {
        Scanner numb= new Scanner (System.in);
        System.out.print("x     : ");
        int div=numb.nextInt();
        System.out.print("batas : ");
        int lim=numb.nextInt();
        
        for (int i=1; i<=lim; i++)
        {
            if (i%div!=0)
                System.out.print(i+" ");
        }
    }  
}