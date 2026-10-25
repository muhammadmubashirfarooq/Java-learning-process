public class recurrsive_function {
        public static int calculateFac(int a){
            if(a==1){
                return 1;
            }
            int factnum1=calculateFac(a-1);
            int factnum2=a*factnum1;
            return factnum2;
         }
         public static void fib(int a , int b , int n){
            if (n==0){
                return ;
            }
            int c=a+b;
            System.out.println(c);
            fib(b, c, n-1);
         }
         public static void main(String [] args){
            //System.out.println(calculateFac(5));
            /*int a=0;
            int b=1;
            System.out.println(a+ "\n" +b);
            int n=7;
            fib(a,b,n-2);*/
            
         }
}

