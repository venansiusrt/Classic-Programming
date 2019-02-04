package pkgcase.condition;

import java.util.Scanner;

public class CaseCondition {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();
    
    if ((nilai>=0)&&(nilai<50))
            System.out.println("E");
    else if ((nilai>=50)&&(nilai<55))
            System.out.println("D");
    else if ((nilai>=55)&&(nilai<65))
            System.out.println("C");
    else if ((nilai>=65)&&(nilai<75))
            System.out.println("B");
    else if ((nilai>=75)&&(nilai<100))
            System.out.println("A");
    else
        System.out.println("Error");
    }
    
}
