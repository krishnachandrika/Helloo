package M3_ass6; /**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */

import java.util.*;

public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        int sum=0;
        double mean;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        mean=(double)sum/(double)n;
        return mean;
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        int n=arr.length;
        double median;
        Arrays.sort(arr);
        if(n%2!=0)
        {
            median=arr[n/2];
        }
        else
            {
                double middle=arr[(n-1)/2]+arr[n/2];
                median=middle/2.0;
            }
        return median;
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        int n=arr.length;
        int maxvalue=arr[0];
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count=count+1;
                }
                if(count>maxcount){
                    maxcount=count;
                    maxvalue=arr[i];
                }
            }
        }

        return maxvalue;
    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        int n=arr.length;
        int sum = 0;
        for (int i=0; i<n; i++)
            sum+=arr[i];
        double mean = (double)sum/(double)n;
        double differ=0;
        for (int i=0; i<n; i++)
        {
            differ =differ+(arr[i]-mean) * (arr[i]-mean);
        }
        return differ / n;
    }



    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
        int n=arr.length;
        int sum=0;
        double differ=0;
        double stvariance=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        double mean=(double)sum/(double)n;
        for(int i=0;i<n;i++)
        {
            differ=differ+ (arr[i] - mean) * (arr[i] - mean);
            stvariance=differ/n;
        }


        return Math.sqrt(stvariance);
    }
}