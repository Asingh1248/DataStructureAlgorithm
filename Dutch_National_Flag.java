public class Solution 
{

    public static void sort012(int[] arr)
    {
        //Write your code here
        int low=0;
        int mid=0;
        int high=arr.length-1;

        
        while(mid<=high){
            if(arr[mid]==0){
       
                   int c;
                   c=arr[mid];
                   arr[mid]=arr[low];
                   arr[low]=c;
            
                low++;
                mid++;
                
            }
            else if(arr[mid]==1){
                mid++;
            }
            
            else if(arr[mid]==2){
                //System.out.println("Before 2 Encounter is "+arr[mid]);
                //swap(arr[high],arr[mid]);
                 int c;
                   c=arr[mid];
                   arr[mid]=arr[high];
                   arr[high]=c;
                high--;
            }
        }
    }
}