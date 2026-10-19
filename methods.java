public class methods {
    public static void main(String[] args){
        int[] arr = {34, 7, 89, 23, 89, 56, 12};

        // call countEven function
        System.out.println("The count of even number in the array is :"+countEven(arr));
        // call secondLarge function
        System.out.println("The second largest number in the array is :"+ second_largest(arr));
        // call contains function
        System.out.println(contains(arr, 7));
        System.out.println(contains(arr, 100));

    }
    public static int countEven(int arr[]){
        int count=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                count=count+1;
            }
        }
        return count;
    }
    public static int second_largest(int arr[]){
        int max=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=max && arr[i]>second){
                second=arr[i];
            }
        }
        return second;
    }
    public static boolean contains(int arr[] , int target){
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
