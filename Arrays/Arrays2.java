//LEFT ROTATE THE ARRAY BY ONE PLACE

import java.util.Scanner;

public class Arrays2 {
  public static void rotateArray(int[] arr , int n ){
    int temp = arr[0];
    for(int i = 1; i<n;i++){
      arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
    return;

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("print the size of an array");
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements");
    for(int i =0;i<n;i++){
      arr[i] = scn.nextInt();
    }
     rotateArray(arr, n);
     //FOR EACH ELEMENT TO LOOP THROUGH AN ARRAY.
     for (int num : arr) {
      System.out.print(num + " ");
    }
    
  }
}
