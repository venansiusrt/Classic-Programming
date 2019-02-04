package methodfibonacci;
public class Methodfibonacci {
    public static void main(String[] args) {
    int sukuKe=5;
        System.out.println("Suku ke "+sukuKe+" dari deret Fibonacci adalah "+fibo(sukuKe));
    }
    
    public static int fibo(int a){
        if (a==1||a==2){
            return 1;
        }
        else {
            return (fibo(a-1)+fibo(a-2));
        }
    }
}
