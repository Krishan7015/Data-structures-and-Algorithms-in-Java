import java.util.*;
public class arraydeletion {
    public static void main(String args []) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        System.out.println("Array before deletion:");
        for( int i = 0; i < n; i++) {
            arr[i] = i + 2;
            System.out.println("arr[" + i +"] = "+arr[i]);
        }
        System.out.println("\nEnter index to be deleted:");
        int index = s.nextInt();
        for (int i = index; i<n-1 ; i++) {
            arr[i] = arr[i+1];
        }
        n--;
        System.out.println("\nArray after deletion:");
        for ( int i = 0; i<n; i++) {
            System.out.println("arr["+i+"] = "+ arr[i]);
        }
        s.close();
    }
}
            
        
    

