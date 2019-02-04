package methods3;
import java.util.Scanner;
public class Methods3 {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
        System.out.print("Input : ");
    int a=input.nextInt();
    
    if (cekbil(a))
            System.out.println("Even Number");
    else
            System.out.println("Odd Number");
    }
    
    public static boolean cekbil (int bil){
        return bil%2==0;
        //Maknanya sama dengan hal berikut.
        /*if (bil%2==0)
            return (true);
        else
            return (false);*/
    }

}
