import java.util.*;
public class linearsearch {
    static int linear_search(int a[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if(a[i]==key){
                System.out.print("Element found at index: "+i);
                return i;
            }
        }
        System.out.println("Element not found.");
        return -1;
    }
    public static void main(String args []){
        int a[] = {10,20,30,40,50};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int key = s.nextInt();
        int n = a.length;
        linear_search(a, n, key);
        s.close();
        }
    }
