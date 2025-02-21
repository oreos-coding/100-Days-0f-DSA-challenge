
import java.util.*;

public class Arrays {

    /* PRINT LARGEST ELEMENT IN AN ARRAY */
    // public static int largestElement(int[] arr, int n){
    // if(n == 0){
    // return -1;
    // }
    // int largest = arr[0];
    // for(int i = 0;i<n;i++){
    // if(arr[i] > largest){
    // largest = arr[i];
    // }
    // }
    // return largest;
    // }
    // public static void main(String[] args){
    // Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the size of an array:");
    // int n = scn.nextInt();
    // int[] arr = new int[n];
    // // Input elements into the array
    // for (int i = 0; i < n; i++) {
    // arr[i] = scn.nextInt();
    // }
    // System.out.println(largestElement(arr,n));
    // }

    /* SECOND LARGEST/SMALLEST ELEMENT IN AN ARRAY */

//     public static int slargst(int[] arr, int n) {
//         if (n < 2)
//             return -1;

//         int largest = arr[0];
//         int slargest = -1;
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > largest) {
//                 slargest = largest;
//                 largest = arr[i];
//             } else if (arr[i] != largest && arr[i] > slargest) { // Ensure it's not equal to largest
//                 slargest = arr[i];
//             }
//         }
//         return slargest;
//     }

//     public static int ssmalst(int[] arr, int n) {
//         if (n < 2)
//             return -1; // If there are fewer than 2 elements, return -1

//         int smallest = arr[0];
//         int ssmallest = Integer.MAX_VALUE; // Corrected from INTEGER_MAX

//         for (int i = 1; i < n; i++) {
//             if (arr[i] < smallest) {
//                 ssmallest = smallest;
//                 smallest = arr[i];
//             } else if (arr[i] != smallest && arr[i] < ssmallest) { // Ensure it's not equal to smallest
//                 ssmallest = arr[i]; // Corrected from smallest = arr[i]
//             }
//         }
//         return ssmallest;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.print("Enter the size of elements: ");
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }

//         int secondLargest = slargst(arr, n);
//         int secondSmallest = ssmalst(arr, n);

//         System.out.println("Second Largest: " + (secondLargest == -1 ? "Not available" : secondLargest));
//         System.out.println(
//                 "Second Smallest: " + (secondSmallest == Integer.MAX_VALUE ? "Not available" : secondSmallest));

//         scn.close();
//     }

/* CHECK IF AN ARRAY IS SORTED */

// public static boolean isSorted(int n, int [] arr){
//     for(int i = 1;i<n;i++){
//         if(arr[i] >= arr[i-1]){
//         }
//         else{
//             return false;
//         }
//     }
//     return true;
// }
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int [] arr = new int[n];
//     for(int i=0;i<n;i++){
//         arr[i] = scn.nextInt();
//     }
//    boolean Sorted =  isSorted(n, arr);
//    System.out.println(Sorted);
// }

/* REMOVE DUPLICATE IN-PLACE FROM SORTED ARRAY */
public static void main(String[] args) {
    
}


}
