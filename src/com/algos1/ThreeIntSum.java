package com.algos1;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chidam on 10/31/17.
 */
public class ThreeIntSum {
    public static int count(int[] a) {
        int N = a.length;
        int count = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    if(a[i] + a[j] + a[k] == 0)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a  = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(count(a));
        long seconds = now.until(ZonedDateTime.now(), ChronoUnit.SECONDS);
        System.out.println("time taken = " + seconds);
    }
}
