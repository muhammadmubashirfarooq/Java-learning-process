public class insertion_sort {
    public static void main(String args[]){
        int [] arr ={1,4,2,5,3,7,5,8,6,9,7,8};
        insertion_sorting(arr);
    }
    public static void insertion_sorting(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
    }
}
