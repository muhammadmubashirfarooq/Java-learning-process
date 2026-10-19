public class recurssion {
    public static void main(String[] args){
        int n=9,m=1;
        decs(n);
        asc(m);
    }
    public static void decs(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decs(n-1);
    }
    public static void asc(int m){
        if(m==9){
            return;
        }
        System.out.println(m);
        asc(m+1);
    }
}