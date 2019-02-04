package methods5;
import java.util.Scanner;
public class Methods5 {

    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    int a,b,c,d,e,f,g;
    System.out.print("Input 7 numbers : ");
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    d=input.nextInt();
    e=input.nextInt();
    f=input.nextInt();
    g=input.nextInt();
    System.out.println("Maximum number is "+max(max(max(max(max(max(a,b),c),d),e),f),g));
    }
    
    public static int max(int bil1, int bil2){
        if (bil1>=bil2)
            return bil1;
        else
            return bil2;
    }
}
