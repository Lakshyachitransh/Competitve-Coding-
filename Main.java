package com.company;

import static com.company.Sliding_window.sliding_window;

public class Main {
    public static int Max_subarray_sum(int [] a,int k){
        int start_window=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for (int end_window=0;end_window<a.length;end_window++){
            sum+=a[end_window];
            if (sum>=k && end_window-start_window+1<min){
                min=Math.abs(start_window-end_window+1);
                sum-=a[start_window];
                start_window++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
	// write your code here
       int [] a={2,1,5,2,8};
       int k=8;
       int max=Max_subarray_sum(a,k);
        System.out.println(max);
    }
}
