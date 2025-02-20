package Stings;
import java.util.*;
public class strings {


  // public static void printLetters(String str){
  //   for(int i=0; i<str.length(); i++){
  //     System.out.print(str.charAt(i) + " ");
  //   }
  //   System.out.println();
  // }
  // public static void main(String[] args) {
    // char arr[] = {'a', 'b', 'c', 'd'};
    // String str = "abcd";
    // String str2 = new String("xyz");

    // //Strings are IMMUTABLE 

    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.next(); 
    // System.out.println(name);

  //  String fullName = "Tony Stark";
  //  System.out.println(fullName.length());

  // String firstName = "Sakshee";
  // printLetters(firstName);
 

  //LETTER - PALINDROME
  
  // public static boolean isPalindrome(String str){
  //   for(int i=0; i<str.length()/2;i++){
  //     int n = str.length();
  //     if(str.charAt(i) != str.charAt(n-i-1)){
  //        return false;
  //     }
  //   }
  //   return true;
  // }
  // public static void main(String args[]) {
  //   Scanner sc = new Scanner(System.in);
  //    String str;
  //    str = sc.nextLine();
  //    System.out.println(isPalindrome(str));
  // }


  /* SHORTEST PATH */

  // public static float getShortestPath(String path){
  //   int x = 0, y = 0;
  //   for(int i = 0; i<path.length(); i++){
  //     char dir = path.charAt(i);
  //     //SOUTH
  //     if(dir == 'S'){
  //       y--;
  //     }
  //     //NORTH
  //     else if(dir == 'N'){
  //       y++;
  //     }
  //     //EAST
  //     else if(dir == 'E'){
  //       x++;
  //     }
  //     //WEST
  //     else{
  //       x--;
  //     }
  //   }
  //   int X2 = x*x;
  //   int Y2 = y*y;
  //   return (float)Math.sqrt(X2 + Y2);

  // }
  // public static void main(String args[]) {
  //   String path = "NS";
  //   System.out.println(getShortestPath(path));
  // }

  // COMPARISON 

  // public static void main(String args[]) {
  //   String s1 = "Tony";
  //   String s2 = "Tony";
  //   String s3 = new String("Tony");

    // if(s1 == s2) {
    //   System.out.println("Strings are equal");
    // }
    // else{
    //   System.out.println("Strings are not equal");
    // }

    // if(s1 == s3) {
    //   System.out.println("Strings are equal");
    // }
    // else{
    //   System.out.println("Strings are not equal");
    // }
  //   if(s1.equals(s3)) {
  //     System.out.println("Strings are equal");
  //   }else{
  //     System.out.println("Strings are not equal");
  //   }

  
  /* SUBSTRING */

  // public static String substring(String str, int si, int ei) {
  //   String substr = "";
  //   for(int i=si; i<ei; i++){
  //     substr += str.charAt(i);
  //   }
  //   return substr;
  // }
  // public static void main(String args[]) {
  //   String str = "HelloWorld";
  //   System.out.println(substring(str,0,5));
  // }

  /* LARGEST STRING */

  // public static void main (String args[]){
  //   String fruits[] = {"apple","banana","mango","strawberry"};
  //   String largest = fruits[0];
  //   for(int i=1; i<fruits.length; i++){
  //     if(largest.compareTo(fruits[i]) < 0 ){
  //       largest = fruits[i];
  //     }
  //   }
  //   System.out.println(largest);
  // }
  }



