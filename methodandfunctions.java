// public class methodandfunctions {
//     public static void main(String[] args) {
// // Ab wo cheez jo tumne shuru mein poochi thi, functions. Ek class mein ye 4 methods banao (sab public static) aur main se unhe call karke test karo:

// // int add(int a, int b) : dono ka sum return kare.
// // boolean isEven(int n) : even ho to true, warna false.
// // int factorial(int n) : n ka factorial return kare (jaise 5 ka 120), loop use karke.
// // int max(int a, int b, int c) : teeno mein se sabse bada return kare.
//     System.out.println("Sum is : " + sum(5, 7));
//     System.out.println(isEven(3));
//     System.out.println("The factorial of a is "+ factorial(5));
//     System.out.println("max no is"+ max(2, 5, 3));

//     }
//     public static int sum(int a , int b){
//         int add = a + b;
//         return add;
//     }
//     public static boolean isEven(int a){
//         if (a%2==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//         }
//     public static int factorial(int a){
//         int fac=1;

//     for (int i=a ; i>0 ; i-- ){
//          fac = i*fac;
//     }
//      return fac;
//     } 
    
//     public static int max(int a , int b , int c){
//         int max_num=a;
//         if (max_num<b){
//             max_num=b;
//         }
//         else if(max_num<c){
//             max_num=c;
//         }
//         return max_num;
//     }
// }
// import java.util.Scanner;
// public class methodandfunctions{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter size of array:");
//         int size ;
//         size = in.nextInt();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = in.nextInt();
//             }
//         sort(arr);
//         print(arr);
//         }
//     public static void sort(int arr[]){
//         for(int i=0 ; i<arr.length-1 ; i++){
//             for (int j = 0; j < arr.length-i-1; j++) {
//                 if (arr[j]<arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
