package array3;
public class Array3 {
    public static void main(String[] args) {
    int[] data = new int [4];
    data[0]=10;
    data[1]=20;
    data[2]=30;
    data[3]=data[1]+data[2];
    
    System.out.println("Data ke 0 : "+data[0]);
    System.out.println("Data ke 1 : "+data[1]);
    System.out.println("Data ke 2 : "+data[2]);
    System.out.println("Data ke 3 : "+data[3]);
    System.out.println("Panjang array adalah " +data.length);
    }
}
