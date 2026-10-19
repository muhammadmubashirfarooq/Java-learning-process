public class arraysPractice {
  public static void main(String[] args) {
    int[] arr={-12, -45, -7, -89, -23, -56};

    System.out.println("max "+ findMax(arr));
    System.out.println("The sum of all the element in arrays is " + sumArr(arr));
    System.out.println("reverse " );
    reverse(arr);
   
  }  
  public static int findMax(int [] arr){
    int largest=arr[0];
   for(int i=0 ; i<arr.length; i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
    }
    public static int sumArr(int [] arr){
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum=arr[i]+sum;
        }
        return sum;
    }
    public static void reverse(int [] arr){
        for(int i=arr.length-1 ; i>=0 ; i--){
            System.out.println(arr[i]);
        }
    }

   
}
