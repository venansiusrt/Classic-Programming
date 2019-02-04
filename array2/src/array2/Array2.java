package array2;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
    Scanner read= new Scanner (System.in);
    System.out.print("Input the length of array : ");
    int length = read.nextInt();
    int [] array=new int [length];
    
    
    for (int i=0;i< array.length;i++){
        array[i]= (int) (Math.random()*2140000000);
        /*
        System.out.print("Input array value for "+i+" index : ");
        array[i]=read.nextInt();
        */
    }
    System.out.println("");
    for(int j=0; j<array.length;j++){
        System.out.println("Value of index "+j+" is "+array[j]);
    }
    }
    
}
