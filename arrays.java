// import java.util.Scanner;
// public class arrays {
// public static void main(String [] args){

//     Scanner input= new Scanner(System.in);
//     int[] marks=new int[5];
//     int i=0;

//     System.out.println("Enter marks 1:");
//     marks[0] = input.nextInt();
//      System.out.println("Enter marks 2:");
//     marks[1] = input.nextInt();
//      System.out.println("Enter marks 3:");
//     marks[2] = input.nextInt();
//      System.out.println("Enter marks 4:");
//     marks[3] = input.nextInt();
//      System.out.println("Enter marks 5:");
//     marks[4] = input.nextInt();

// while(i<5){
//     System.out.println(marks[i]);
//     i++;
// }
// 
// Scanner input=new Scanner(System.in);
// int marks[] =new int[5];

// for (int i=0 ; i<marks.length ; i++){
// System.out.println("Enter 5 numbers:");
// marks[i]=input.nextInt();
// }

// for (int i=0 ; i<marks.length ; i++){
//     if (marks[i]>=50){
//          System.out.print(marks[i]);
//          System.out.print("pass");
//  }
//  else{
//     System.out.print(marks[i]);
//     System.out.println("fail:");
//  }
// }
// Scanner input = new Scanner (System.in);
// int i=10;
// int marks[] = new int[i];
// int highest_marks=0;

// for(int j=0 ; j<i ; j++){
//     System.out.println("Enter marks "+ (j+1));
//     marks[j]=input.nextInt();

// }
// for(int j=0 ; j<i ; j++){

//     if ( highest_marks < marks[j]){
//         highest_marks=marks[j];

//     }
//     System.out.println(marks[j]);
    

    
// }
// System.out.print(highest_marks);


// 
// Scanner input=new Scanner(System.in);
// int arraySize=10;
// int total=0 , average=0 ,pass=0 ,fail=0;
// int marks[] = new int[arraySize];
// for (int i=0 ; i<arraySize ;i++){
//     System.out.print("Enter marks"+(i+1)+ ":");
//     marks[i]=input.nextInt();
//     total=total+marks[i];
//     if (marks[i]>50){
//         pass=pass+1;
//     }
//     else{
//         fail=fail+1;
//     }
    
// }
// average=total/arraySize;

// System.out.println("average marks is "+average);
// System.out.println("total Marks is "+total);
// System.out.println("passed students are "+pass);
// System.out.println("fail students are "+fail);

//  Scanner input=new Scanner(System.in);
//  int arraySize=5;
 
//  int marks[]= new int[arraySize];

//  int highest_marks=marks[0] , lowest_marks=marks[0] , even=0 , odd=0;
// for (int i=0 ; i<arraySize ;i++)
// {
//     System.out.println("Enter marks of student "+(i+1)+":");
//     marks[i]=input.nextInt();
//     if (marks[i]>highest_marks){
//         highest_marks=marks[i];
//     }
//     if (marks[i]<lowest_marks){
//         lowest_marks=marks[i];
//     }
//     if(marks[i]%2==0){
//         even=even+1;
//     }
//     else{
//         odd=odd+1;
//     }

// }
// System.out.println(highest_marks);
// System.out.println(lowest_marks);
// System.out.println(even);
// System.out.println(odd);

// Scanner input=new Scanner(System.in);
// int arr=10 , positive=0 , negative=0 , zero=0  , pos_sum=0 , neg_sum=0;
// int num[] = new int[arr];
// for (int i=0 ; i<arr ;i++){
//     System.out.println("Enter numbers"+(i+1)+":");
//     num[i]=input.nextInt();
//     if (num[i]>0){
//         positive=positive+1;
//         pos_sum=pos_sum+num[i];
//     }
//     if (num[i]<0){
//         negative=negative+1;
//         neg_sum=neg_sum+num[i];
//     }
//     if (num[i]==0){
//         zero=zero+1;
//     }
//     }
//     System.out.println("positive numbers="+positive);
//     System.out.println("negative numbers="+negative);
//     System.out.println("zeros ="+zero);
//     System.out.println("sum of postitive numbers are:"+ pos_sum);
//     System.out.println("sum of negative numbers are:"+neg_sum);
//input and display the values of array
// Scanner input = new Scanner (System.in);
// int num=input.nextInt();
// int arr[] = new int[num];
// for (int i=0 ; i<num ; i++){
//     arr[i]=input.nextInt();
    

// }
// for(int i=0 ; i<num ; i++ ){
//     System.out.println(arr[i]);
// }
// Scanner input = new Scanner(System.in);
// int arr_size=5;
// String names[] = new String[arr_size];
// int age[] = new int[arr_size];
// float marks[] = new float[arr_size];

// for(int i=0 ;i<arr_size; i++){
//     System.out.println("Enter name:");
//     names[i]=input.nextLine();

//     System.out.println("Enter age:");
//     age[i]=input.nextInt();
//     input.nextLine();
//     System.out.println("Enter marks:");
//     marks[i]=input.nextFloat();
//     input.nextLine();

// }
// for(int i=0 ; i<arr_size ; i++){
//     System.out.println("Name :" + names[i]);
//     System.out.println("Age :" + age[i]);
//     System.out.println("Marks :" + marks[i]);

// }

// Scanner input = new Scanner(System.in);
// int rows=2 ;
// int cols=3;
// int [][] numbers=new int[rows][cols];
// for(int i=0 ; i<rows ;i++){
//     for(int j=0 ;j<cols ;j++){
//         numbers[i][j]=input.nextInt();
//         System.out
//     }
// }
// // for(int i=0 ; i<rows ;i++){
// //     for(int j=0 ;j<cols ;j++){
// //         System.out.print(numbers[i][j]+" ");
// //     }
// //     System.out.println();
// // }

// System.out.println(numbers[0][1]);

// Scanner input = new Scanner(System.in);
// int students=3,marks=4;
// int[] total = new int[students];
// double[] avg = new double[students];
// int[][] numbers = new int[students][marks];
// for (int i=0 ; i<students ; i++){
//     int sum=0;
//     for (int j=0 ; j<marks ; j++){
//         numbers[i][j]=input.nextInt();
//         sum=sum+numbers[i][j];
//         }
// total[i]=sum;
// avg[i]=(double) sum/marks;

// }
// for (int i=0 ; i<students ; i++){
//     for (int j=0 ; j<marks ; j++){
//         System.out.print(numbers[i][j]+" ");
  
        
        
//     }
//     System.out.println();
//     System.out.println("The sum of student one marks is "+ (i+1) + "is" + total[i]);
//     System.out.println("The sum of student one marks is "+ (i+1) + "is" + avg[i]);
//     System.out.println();
   
    
// }
// Scanner in = new Scanner (System.in );
// int cities=4, days=7;
// int[][] temp = new int[cities][days];
// int total[] = new int[cities];
// double avg[] = new double[cities];
// for(int i=0 ; i<cities ; i++){
//     int sum=0;
//     System.err.println("Enter temperature of city " + (i+1) +" : ");
//     for(int j=0 ; j<days ;j++){
//        System.out.print("day " + (j+1) + " : "); 
//         temp[i][j]=in.nextInt();
//         sum+=temp[i][j];
// }
// System.err.println();
// total[i]=sum;
// avg[i]= (double) sum/days;

// }
// for (int i=0 ; i<cities ; i++){
//     System.err.println("City " + (i+1) + " :::::");
//     for(int j=0 ; j<days ; j++){
        
//         System.out.print("Day " + (j+1) + " : " + temp[i][j] + " | ");
//     }
//     System.out.println("The average of day " + (i+1) + " is " + avg[i]);
// //     System.out.println();
// // }
// // ;





// }};