package Recursion;
//DECREASING order - Recursion

import java.util.Scanner;

public class Recursions{
//   public static void printDec(int n) {
//     if(n==1){
//       System.out.println(n);
//       return;
//     }
//    System.out.print(n+" ");
//    printDec(n-1);
//   }
  
//INCREASING order - Recursion

// public static void printInc(int n){
//   if(n == 1){
//     System.out.println(n+ " ");
//     return;
//   }
//   printInc(n-1);
//   System.out.print(n+" ");
// }
//   public static void main(String[] args) {
//     int n = 10;
//     printDec(n);
//     printInc(n);
//   }


//RECURSION
// public static int fact(int n){
//   if(n==0){
//     return 1;
//   }
//   int fnm1 = fact(n-1);
//   int fn = n * fact(n-1);
//   return fn;
// }
// public static void main(String[] args) {
//   int n = 5;
//   System.out.println(fact(n));
// }

// public static void print(int count){
//   if(count == 3){
//   return;
//   }
//   System.out.println(count);
//   print(count+1);
// } 
// public static void main(String[] args){
//     print(0);
// }

/* FACTORIAL */
// public static int sum(int n){
//   if(n == 0) 
//   return 1;
//   return n * sum(n-1);
  
// }
// public static void main(String[] args) {
//   // int n = 4;
//   System.out.println(sum(4));
// }


/*  REVERSING AN ARRAY */
// public static void f(int i,int[] arr, int n){
//    if(i>=n/2) return; //base case: stop when middle is reached

//    //swapping elements
//    int temp = arr[i];
//    arr[i] = arr[n-i-1];
//    arr[n-i-1] = temp;

//    f(i+1,arr,n);//Recursive call
// }
// public static void main(String[] args) {
//   Scanner scanner = new Scanner(System.in);
//   System.out.println("Enter the size of the array:");
//   int n = scanner.nextInt();
//   int[] arr = new int[n];
//   System.out.println("Enter the array elements:");
//   for (int i = 0; i < n; i++) {
//   arr[i] = scanner.nextInt();
//   }

//   //Calling the recursive func to reverse the array
//   f(0,arr,n);
//   System.out.println("Reversed array:");
//   for(int i = 0;i<n;i++){
//    System.out.print(arr[i] + " ");
//   }
//    scanner.close();
// }

/* CHECK IF A STRING IS AN PALINDROME */
// public static boolean f(int i, String s)
// {
//   if(i >= s.length()/2) return true;
//   if(s.charAt(i) != s.charAt(s.length()-i-1)){
//     return false;
//   }
//   return f(i+1,s);
// }
// public static void main(String[] args) {
//   String s = "madam";
//   boolean isPalindrome = f(0,s);
//   System.out.println(isPalindrome);
// }

public static int f(int n){
  if(n<=1) return n;
  int last = f(n-1);
  int slast = f(n-2);
  return last + slast;
}
public static void main(String[] args) {
  int fib = f(4);
  System.out.println(fib);;
}
}


