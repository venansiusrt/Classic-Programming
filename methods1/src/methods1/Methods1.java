package methods1;
import java.util.Scanner;
public class Methods1 {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int a,b,c,d;
    
    System.out.print("Input A(a,b) and B(c,d) {a,b,c,d}: ");
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    d=input.nextInt();
    
    double dis=jarak(a,b,c,d);
        System.out.println(dis);
    }

public static double jarak(int x1, int y1, int x2, int y2){
    int r;
    r=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
    double jar=Math.sqrt(r);
return (jar);
}

    
}
