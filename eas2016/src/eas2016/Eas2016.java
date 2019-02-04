package eas2016;
public class Eas2016 {
    public static void main(String[] args) {
        int i=2;
        while(i<6){
            methodA(i);
            i++;
        }
        System.out.println("i is "+i);
    }
    
    public static void methodA(int i){
        do
        {
            if(i%5!=0)
                System.out.print(i+" ");
                i--;
        }
        while (i >= 1);
            System.out.println();
        
        }
}
