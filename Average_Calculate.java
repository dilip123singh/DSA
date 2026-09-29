public class Average_Calculate {
    public static void main(String args[]){
        int[] arr={5, 2, 2};
        int sum=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            count++;
        }
        System.out.println(sum/count);
    }
}
