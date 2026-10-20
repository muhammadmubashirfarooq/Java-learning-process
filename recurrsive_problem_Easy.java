import java.util.Scanner;
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter  num:");
     int n = input.nextInt();
    // printNum(1, n);
    //printNumRev(n);
    // int sum=0;
    // System.out.println(printSum(n,  sum ));
    // System.out.println(printfac(n));
    // System.out.println(power(2, n));
    System.out.println(sumDigits(n));

}
//Q1============================
public static int printNum(int a , int b){
    if(a==b){
        return b;
    }
    System.out.println(a);
    return printNum(a+1, b);
}
//Q2=============================
public static void printNumRev(int b){
    if(b==0){
        return ;
    }
    System.out.println(b);
    printNumRev(b-1);
}
//Q3===========================
public static int printSum(int n , int sum){
    if(n==0){
        return n ;
    }
    return n + (printSum(n-1, sum));
}
//Q4================================
public static int printfac(int n){
    int factorial=n;
    if(n==1){
        return n;
    }
    return factorial*printfac(n-1);
}
//Q5=================================
public static int power(int i , int j){
    
    if(j==1){
        return i;
    }
   return i * power(i,j-1);
}
//Q6=================================
public static int sumDigits(int n){
    if(n==0){
        return 0;
    }
    return n % 10 + sumDigits(n/10);
}