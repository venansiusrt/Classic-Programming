package methods4;
import java.util.Scanner;
public class Methods4 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int p=input.nextInt();
    int q=input.nextInt();
    int r=input.nextInt();
    
    System.out.println("D = "+diskriminan(p,q,r));
    System.out.println("Tipe Diskriminan = "+jenisdis(p,q,r));
}

    public static int diskriminan (int a, int b, int c){
    int D=b*b-4*a*c;
    return (D);
}

public static String jenisdis (int a, int b, int c){
    if (diskriminan(a,b,c)==0)
        return "Kembar";
    else if (diskriminan(a,b,c)>0)
        return "Akar real";
    else
        return "Imajiner";
}

}
