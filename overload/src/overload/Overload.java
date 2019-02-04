package overload;
public class Overload {
    public static void main(String[] args) {
    System.out.println(luas(4,5));
    System.out.println(luas(3.5,2.5));
    System.out.println(luas(3));
    System.out.println(luas(3,3.1));
    
    int x=9;
    test();
    test(x);
    System.out.println("x= "+x);
    }
    
    public static double luas(double a){
    return (a*a);
    }
    
    public static double luas(int a,int b){
    return (a*b);
    }
    
    public static void test (int x){
    x=x+5;
    System.out.println("x= "+x);
    }
    
    public static void test (){
    int x=50;
    System.out.println("x= "+x);
    }
    
    public static double luas(double a,double b){
    return (a*b);
    }
    
    public static double luas(int a,double b){
    return (0.5*a*b);
    }
}