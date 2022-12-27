package DS_04_Array_and_Strings.Arrays_and_Questions;

public class MajorityElement {

    // gfg link - https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
    // gfg solution
    static int majorityElement(int arr[], int size){
        int ansIndex = 0;
        int count = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == arr[ansIndex]){
                count ++;
            }else{
                count--;
            }
            if(count == 0){
                count = 1;
                ansIndex = i;
            }
        }
        
        int major = arr[ansIndex];
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == major) ans++;
        }
        
        return ans > size/2 ? major: -1;
    }

    // leetcode link - https://leetcode.com/problems/majority-element/
    // leetcode solution
    public int majorityElement(int[] arr) {
        int ansIndex = 0, cnt = 1;      
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]== arr[ansIndex]) cnt++;
            else cnt--;
            if(cnt == 0) {
                cnt = 1;
                ansIndex = i;
            }
        }        
        return  arr[ansIndex];
    }

}
