package methods2;
import java.util.Scanner;
public class Methods2 {
    public static void main(String[] args) {
    
    Scanner input=new Scanner (System.in);
    int a,b,c;
    
    System.out.print("Input ax^2 + bx +c [a,b,c]: ");
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    
    String jenis=jenisakar(a,b,c);
        System.out.println(jenis);
    }

public static String jenisakar(int a, int b, int c){
    int diskriminan=b*b-4*a*c;
    String tipe;
    
    if (diskriminan>0)
        tipe="berlainan";
    else if (diskriminan<0)
        tipe="imajiner";
    else
        tipe="kembar";

    return (tipe);
}
}