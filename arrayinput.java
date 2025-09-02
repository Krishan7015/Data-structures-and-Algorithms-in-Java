import java.util.*;
public class arrayinput { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("\nEnter size of array:");
        n=s.nextInt();
        int[] array = new int[n];
        System.out.println("\nArray before insertion:");
        for(int i = 0; i < n; i++) {
            System.out.println("array["+i+"] = "+array[i]);
        } 
       System.out.println("\nEnter numbers to be inserted in array:");
       for(int i = 0; i < n; i++) {
        array[i] = s.nextInt();
       }
       System.out.println("\nArray after insertion:");
       for (int i = 0; i<n ; i++) {
        System.out.println("array["+i+"] = "+array[i]);
       }
        s.close();
    }
}
