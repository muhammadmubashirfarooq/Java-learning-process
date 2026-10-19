public class loops {
    public static void main(String[] args) {
        
        //Q1
        // for loop se 1 se 10 tak numbers print karo.
        // while loop se 1 se 20 tak ke sirf even numbers print karo.
        // 1 se 100 tak ke saare numbers ka sum nikaalo aur print karo (answer 5050 aana chahiye).
        int i=1 , sum=0 ;
        for( i=1 ; i<=10 ; i++){
            System.out.println(i);
        }
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
            
            i++;
        }
        for(i=1 ;  i<=100 ; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
