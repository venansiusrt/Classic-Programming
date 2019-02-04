package tugas.pkg3.pkg3;

import java.util.Scanner;
public class Tugas33 {
    
    public static void main(String[] args) {
    Scanner hola = new Scanner (System.in);
    System.out.print("Enter a, b, c, d, e, f : ");
    float a = hola.nextFloat();
    float b = hola.nextFloat();
    float c = hola.nextFloat();
    float d = hola.nextFloat();
    float e = hola.nextFloat();
    float f = hola.nextFloat();
    
    double xpb, ypb, pn, nilaix, nilaiy;
    
    xpb =(e*d)-(b*f);
    ypb =(a*f)-(e*c);
    pn =(a*d)-(b*c);
    nilaix = xpb/pn;
    nilaiy = ypb/pn;
    
    if (pn==0)
    {
        System.out.println("The equation has no solution");
    }
    else
    {
        System.out.println("x is "+nilaix+" and y is "+nilaiy);
    }
    
    }
    
}