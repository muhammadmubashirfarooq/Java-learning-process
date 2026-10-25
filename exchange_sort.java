public class exchange_sort{
    public static void main(String [] args){
        int arr[]={1,3,5,2,4,8,6,7};
    exchange_sort(arr);
    }
    public static void exchange_sort(int arr[] ){
        for(int i=0 ; i<arr.length-1 ; i++){
            for (int j=i+1 ; j<arr.length ; j++ ) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
    
}
