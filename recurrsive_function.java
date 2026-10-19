public class recurrsive_function {
        public static int calculateFac(int a){
            if(a==1){
                return 1;
            }
            int factnum1=calculateFac(a-1);
            int factnum2=a*factnum1;
            return factnum2;
         }
         public static void main(String [] args){
            System.out.println(calculateFac(5));
         }
}
