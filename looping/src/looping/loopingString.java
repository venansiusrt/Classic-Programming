package looping;

import java.util.Scanner;
public class loopingString {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Input : ");
        int a = input.nextInt();
        
        int i=0;
        while (i<a) 
            {
                System.out.println("Hello World");
                i++;
            }
    }
    
}
