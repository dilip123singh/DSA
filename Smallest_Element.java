public class Smallest_Element {
    public static void main(String args[]){
        int[] arr={780, 543, 90, 124};
        int small_element=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small_element){
                small_element=arr[i];
            }
        }
        System.out.println(small_element);
    }
}
