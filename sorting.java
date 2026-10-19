// public class sorting {

//         public static void main(String[] args) {
//                 // bubble sorting
//             int[] arr = {2,7,3,8,5,6,9,1};
            
//             for(int i=0 ; i<arr.length ; i++){
//                 for(int j=0 ; j<arr.length-i-1 ; j++){
//                         if(arr[j]>arr[j+1]){
//                                 int temp = arr[j];
//                                 arr[j] = arr[j+1];
//                                 arr[j+1] = temp;
//                         }
//                 }
//                 }
//                 print(arr);
       
//         }
//         public static void print(int arr[]){

//                 for(int i=0 ; i<arr.length ;i++){
                        
//                 System.out.print(arr[i]+ " ");
                        
//         }

//         }
// }
// import java.util.Scanner;
// public class sorting{
//         public static void main(String[] args) {

//                 Scanner in = new Scanner(System.in);
//                 System.out.println("Enter arr size:");
//                 int size;
//                 size = in.nextInt();
//                 int[] arr = new int[size];
//                 System.out.println("Enter elements in array:");
//                 for (int i = 0; i < size ; i++) {
//                         arr[i]=in.nextInt();
//                 }
//                 selectionSort(arr);
//                 print(arr);
                
                
                
//         }
//         public static void selectionSort(int arr[]){
//                 for (int i = 0; i < arr.length; i++) {
//                         int smallest=i;
//                         for (int j = i+1 ; j < arr.length; j++) {
//                                 if (arr[smallest] > arr[j]) {
//                                         smallest = j;
//                                 }
//                         }
//                         int temp = arr[smallest];
//                         arr[smallest] = arr [i];
//                         arr[i] = temp;
//                 }
//         }
//         public static void print(int arr[]){
//                 for (int i = 0; i < arr.length; i++) {
//                         System.out.print(arr[i] + " ");
//                 }
//         }
// }
        

