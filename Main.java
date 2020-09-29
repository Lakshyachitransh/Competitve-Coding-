package com.company;

import java.util.ArrayList;
public class Main {
    public static ArrayList pair(int[] a,int sum) {
        ArrayList<Integer> subset = new ArrayList<>();
        int n = a.length;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            if (a[start] + a[end] < sum) {
                start++;
            } else if (a[start] + a[end] > sum) {
                end--;
            } else {

                subset.add(start);
                subset.add(end);
                break;
            }
        }
            return subset;
        }


    public static void main(String[] args) {
	// write your code here
        int[] a={2,5,9,11};
        int sum=11;
        ArrayList<Integer> subset =new ArrayList<>();
        subset=pair(a,sum);
        System.out.println(subset);
    }


}
