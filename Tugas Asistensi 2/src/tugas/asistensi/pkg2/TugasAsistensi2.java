package tugas.asistensi.pkg2;
import java.util.Scanner;

public class TugasAsistensi2 {
    public static void main(String[] args) {
    Scanner baca= new Scanner (System.in);
        
        System.out.println("FIVE IN ONE");
        System.out.println("\nPress 1 for entering Cube program");
        System.out.println("Press 2 for entering Block program");
        System.out.println("Press 3 for entering Tube program");
        System.out.println("Press 4 for entering Cone program");
        System.out.println("Press 5 for entering Sphere program");
        System.out.print("\nInput : ");
        
        int a = baca.nextInt();
        double b,c;
        
        if (a==1)
        {
                System.out.println("\n------------------------------------------");
                System.out.println("\nWELCOME TO CUBE PROGRAM");
                System.out.print("\nInput the length of the Cube (m): ");
                double s = baca.nextDouble();
                b=s*s*s;
                c=6*s*s;
                System.out.println("\nThe Volume of the Cube is          : "+b+" meter cubics");
                System.out.println("The area of surface of the Cube is : "+c+" meter squares");
            }
        else if (a==2)
            {
                System.out.println("\n------------------------------------------");
                System.out.println("\nWELCOME TO BLOCK PROGRAM");
                System.out.print("\nInput the length of the Block (m)   : ");
                double p = baca.nextDouble();
                System.out.print("Input the width of the Block (m)    : ");
                double l = baca.nextDouble();
                System.out.print("Input the altitude of the Block (m) : ");
                double t = baca.nextDouble();
                b=p*l*t;
                c=2*((p*l)+(p*t)+(l*t));
                System.out.println("\nThe Volume of the Block is          : "+b+" meter cubics");
                System.out.println("The area of surface of the Block is : "+c+" meter squares");
            }
        else if (a==3)
            {
                System.out.println("\n------------------------------------------");
                System.out.println("\nWELCOME TO TUBE PROGRAM");
                System.out.print("\nInput the radius of the Tube (m)   : ");
                double r = baca.nextDouble();
                System.out.print("Input the height of the Tube (m)   : ");
                double h = baca.nextDouble();
                b=(22*r*r*h)/7;
                c=(44*r*(r+h))/7;
                System.out.println("\nThe Volume of the Tube is          : "+b+" meter cubics");
                System.out.println("The area of surface of the Tube is : "+c+" meter squares");
            }
        else if (a==4)
            {
                System.out.println("\n------------------------------------------");
                System.out.println("\nWELCOME TO CONE PROGRAM");
                System.out.print("\nInput the radius of the Cone (m)   : ");
                double r = baca.nextDouble();
                System.out.print("Input the height of the Cone (m)   : ");
                double h = baca.nextDouble();
                b=(22*r*r*h)/21;
                double s;
                s = Math.pow((r*r)+((h*h)),0.5);
                c=(22*r*(r+s))/7;
                System.out.println("\nThe Volume of the Cone is          : "+b+" meter cubics");
                System.out.println("The area of surface of the Cone is : "+c+" meter squares");
            }
        else if (a==5)
            {
                System.out.println("\n------------------------------------------");
                System.out.println("\nWELCOME TO SPHERE PROGRAM");
                System.out.print("\nInput the radius of the Sphere (m)   : ");
                double r = baca.nextDouble();
                b=(88*r*r*r)/21;
                c=(88*r*r)/7;
                System.out.println("\nThe Volume of the Sphere is          : "+b+" meter cubics");
                System.out.println("The area of surface of the Sphere is : "+c+" meter squares");
            }
        else {
            System.out.println("\nWrong input, restart the program");}
    }
    
}
