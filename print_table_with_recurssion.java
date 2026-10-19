public class print_table_with_recurssion{
    
    public static void main(String[] args){
        int n=4,result=1;
//     ======print numbers=======
 //       printnum(n);
 //     ======print sum=======
 //     System.out.println(printSum(n, m));
//      ======print factorial with void===========
        factorial(n , result);

    }
    public static void printnum(int n){
        if (n==9){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
    public static int printSum(int n , int m){
        
        if(n > m){        //if(1>5) function return hojaega
            return n;
        }
        
        return n+printSum(n+1, m);
        
    }
    //factorial with void function
    public static void factorial(int n , int  result  ){
        if(n==0){
            System.out.println(result);
            return;
        }
        
        factorial(n-1,result*n);
    }
    
} 