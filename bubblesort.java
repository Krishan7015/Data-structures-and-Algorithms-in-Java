public class bubblesort {
    public static void main(String [] args) {
        int arr[]= {3,5,2,23,52,12,56,32,22};
        int n = arr.length;
        System.out.println("Array Before Sorting:");
        for(int i = 0; i < n; i++) {
            System.out.println("arr["+i+"] = "+arr[i] );
        }
        for(int i = 0; i < n; i++) {
            int swaps = 0;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
        System.out.println("Array After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
