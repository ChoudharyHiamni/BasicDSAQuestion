public class secondLargestNumberInList {
    
    public static void main(String args[]){
        int num[]={10,59,76,34,54};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }
            else if(num[i]>secondLargest && num[i]!=largest){
                secondLargest=num[i];

            }
            
        }
        System.out.println("Largest number is: "+largest);
        System.out.println("Second largest number is: "+secondLargest);
    }
}
