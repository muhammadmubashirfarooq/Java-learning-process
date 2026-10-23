import java.util.Scanner;
public static void main(String[] args) {
    // Scanner input=new Scanner(System.in);
    // System.out.println("Enter  num:");
    //  int n = input.nextInt();
    // printNum(1, n);
    //printNumRev(n);
    // int sum=0;
    // System.out.println(printSum(n,  sum ));
    // System.out.println(printfac(n));
    // System.out.println(power(2, n));
    // System.out.println(sumDigits(n));
    //reverseAnum(n);
    // System.out.println(coutEven(n));
    //System.out.println(printFib(n));
    // System.out.println(product(n));
    // System.out.println(reverse(n, 0));
    // System.out.println(is_palin(n));
    // int arr[] = {2,3,5};
    // // System.out.println(revArr(arr,arr.length-1));
    // System.out.println(minArr(arr, arr.length-1));
    // System.out.println(maxArr(arr, arr.length-1));
    // System.out.println(GDC(12, 8));
    // backTrac(9);
    // System.out.println(sum(5 ));
    // System.out.println(powwer(2,5));
    // printnum(3);
    // System.out.println(pro(1234));]
    int arr[]={1,5,3,8};
    System.out.println(issorted(arr, 0));
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
//Q7=======================================
public static void reverseAnum(int n){
    if(n==0){
        return ;
    }
    System.out.print(n%10);
    reverseAnum(n/10);
    
}
//Q8===================================
public static int coutEven(int digit){
    if(digit==0){
        return 0;
    }
    if ((digit%2)%2==0){ 
        return 1+coutEven(digit/10);
    }
    else{
        return coutEven(digit/10);
    }

}
//Q9======================================
public static int printFib(int n){
    if(n<=1)
        return n;
    return printFib(n-1)+printFib(n-2);
}
//Q10=====================================
public static int countDig(int n){
    if(n==0){
        return n;
    }
    return 1 + (countDig(n/10));
}
//Q11===================================
public static int product(int n){
    if(n==0){
        return 1;
    }
    return n%10 * (product((n/10)));
}
//Q12=========================
public static int reverse(int n , int rev){
    if(n==0){
        return rev;
    }
    return reverse(n/10,rev*10+n%10);
}
public static boolean is_palin(int n){
    return n==(reverse(n, 0));
}
//Q13====================================
public static int revArr(int arr[] , int i){
    if(i==0){
        return arr[i];
    }
    return arr[i] + revArr(arr, i-1);
}
//Q15===================================
public static int maxArr(int arr[] , int i){
    if(i==0){
        return arr[i];
    }
    return Math.max(arr[i], maxArr(arr , i-1));
   }
public static int minArr(int arr[] , int i){
    if(i==0){
        return arr[i];
    }
    return Math.min(arr[i], minArr(arr , i-1));
   }
//Q16====================================
public static int GDC(int a , int b){
    if (b==0){
        return a;
    }
    return GDC(b,a%b);
}
//Q17=======================================
public static void backTrac(int n){
    if(n==0){
        return ;
    }
    backTrac(n-1);
    System.out.println(n);
}
///Q1. Sum of first n numbers
//sum(5) = 1 + 2 + 3 + 4 + 5 = 15
public static int sum(int i){
    if(i==0){
        return i;
    }
    return i+sum(i-1);

}
//Q2. power==================
public static int powwer(int i ,int j){
    if(j==0){
        return 1;
    }
    return i*(powwer(i,j-1));
}
//Q3.===============================
public static void printnum(int i){
    if(i==0){
        return ;
    }
    System.out.println(i);
    printnum(i-1);
}
//Q4=========================
public static int pro(int i){
    if(i==0){
        return 0;
    }
    return i%10 + (pro(i/10));
}
//Q5===========================
public static boolean issorted(int arr[] , int i){
    if (i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return issorted(arr, i+1);

}