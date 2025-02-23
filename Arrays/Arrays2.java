//LEFT ROTATE THE ARRAY BY ONE PLACE

import java.util.Scanner;

public class Arrays2 {
  // public static void rotateArray(int[] arr , int n ){
  //   int temp = arr[0];
  //   for(int i = 1; i<n;i++){
  //     arr[i-1] = arr[i];
  //   }
  //   arr[n-1] = temp;
  //   return;

  // }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("print the size of an array");
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements");
    for(int i =0;i<n;i++){
      arr[i] = scn.nextInt();
    }

    /* left rotate by d  */

    // System.out.println("Enter the no. of places to rotate");
    // int d = scn.nextInt();
    // leftRotate(arr, n, d);
    // for( int num:arr){
    //   System.out.print(num+" ");
    // }

    /* Rotateby1place */

    //  rotateArray(arr, n);
    //  //FOR EACH ELEMENT TO LOOP THROUGH AN ARRAY.
    //  for (int num : arr) {
    //   System.out.print(num + " ");
    // }
  }
  /*LEFT ROTATE BY D PLACES */

  /* METHOD TO REVERSE A PORTION OF THE ARRAY */
  // public static void reverse(int[] arr, int start, int end) {
  //   while (start < end) {
  //     int temp = arr[start];
  //     arr[start] = arr[end];
  //     arr[end] = temp;
  //     start++;
  //     end--;
  //   }
  // }

  // public static void leftRotate(int[] arr, int n, int d) {
  //   reverse(arr, 0, d - 1);   // Reverse first 'd' elements
  //   reverse(arr, d, n - 1);   // Reverse remaining elements
  //   reverse(arr, 0, n - 1);   // Reverse the entire array
// }

/* Move all zeros to the end of the array */





}
