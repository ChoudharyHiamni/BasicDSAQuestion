public class largestSmallestInArray {
    
    public static void main(String rags[]){
        int arr[]={5,7,8,9,2,3,1,};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest number in the array is: "+largest);
        System.out.println("Smallest number in the array is: "+smallest);
    }
}
