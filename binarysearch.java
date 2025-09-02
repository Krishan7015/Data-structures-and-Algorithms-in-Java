import java.util.*;
public class binarysearch {
    static void binary_search(int arr[], int low, int high, int key){
        if(low > high){
            System.out.println("Element not found!");
            return;
            }
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index: "+(mid + 1));
            }
            else if(key < arr[mid]) {
                binary_search(arr, low, mid - 1, key);
            }
            else if(key > arr[mid]){
                binary_search(arr, mid + 1, high, key);
            }
        }
        public static void main(String args []) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the element to be searched: ");
            int key = s.nextInt();
            int arr[] = {2,3,4,10,40,67};
            int n = arr.length;
            binary_search(arr, 0, n-1, key);
            s.close();
        }
    }
         
         
