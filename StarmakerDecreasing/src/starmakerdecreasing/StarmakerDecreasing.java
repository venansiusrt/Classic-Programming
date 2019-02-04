package starmakerdecreasing;

import java.util.Scanner;
public class StarmakerDecreasing {
public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("Input : ");
    int star=input.nextInt();
    
    for (int i=0; i<star; i++)
    {
        for(int a=star; a>i; a-- )
        {
        System.out.print("*");
        }
        System.out.println("");
    }
    }
    
}
