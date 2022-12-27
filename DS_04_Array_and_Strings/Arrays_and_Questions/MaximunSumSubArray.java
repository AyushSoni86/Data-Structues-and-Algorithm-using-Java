package DS_04_Array_and_Strings.Arrays_and_Questions;

public class MaximunSumSubArray {

    // kadane's algorithm 
    static int maxSumSubArray(int[] arr){
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    
    }

    // gfg link : https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1 
    long maxSubarraySum(int arr[], int n){
        long maxSum = 0;
        long currentSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum > 0 ? maxSum : findMax(arr);
    }
    
    long findMax(int[] arr){
        long max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
