public class Missing_Number {
    public static void main(String args[]){
        int[] arr={1, 2,4, 5};
        int miss_number=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] > 1){
                miss_number=arr[i] + 1;
                break;
            }
        }
        System.out.println(miss_number);
    }
}
