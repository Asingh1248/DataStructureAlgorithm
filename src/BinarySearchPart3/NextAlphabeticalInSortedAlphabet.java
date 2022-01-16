package BinarySearchPart3;

import java.util.Arrays;

public class NextAlphabeticalInSortedAlphabet {

    public static void main(String[] args) {

        char alphabet[] = {'a','c','f','h'};
        char key='f';
        int n= alphabet.length;

        char ans = nextAlphabet(alphabet,key,n);
        System.out.println("Next element after : " +key + " in "+ Arrays.toString(alphabet) + " is "+ans);

    }

    private static char nextAlphabet(char[] arr, char key, int n) {
        char result='#';
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
               start=mid+1; //Same as ceil but since we want next element
            }
            else if(arr[mid]<key){ //Right side
                start=mid+1;
            }
            else if(arr[mid]>key){
                result=arr[mid]; //Left side then arr[mid] is smallest greatest element after f
                //System.out.println(result);
                end=mid-1;
            }

        }
        return result;

    }

}
