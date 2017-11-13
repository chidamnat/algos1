package com.algos1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chidam on 11/2/17.
 */
public class BinarySearchSimple {
    public static int binarySearch(int[] a, int key) {
        int lo = 0, hi = a.length-1;
        while(lo<=hi) {
            int mid = lo + (hi -lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        int key = scanner.nextInt();
        System.out.println(binarySearch(a,key));
    }
}


