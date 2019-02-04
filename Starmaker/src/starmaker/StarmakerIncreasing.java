package starmaker;

import java.util.Scanner;
public class StarmakerIncreasing {
    public static void main(String[] args) {
        Scanner halo = new Scanner (System.in);
        
        System.out.print("Input : ");
        int star = halo.nextInt();
        
        for (int i=1; i<=star; i++) {for (int a =1; a<=i; a++){System.out.print("*");}System.out.println("");}
    }
}
