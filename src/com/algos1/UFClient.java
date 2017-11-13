package com.algos1;

import java.util.Scanner;

/**
 * Created by chidam on 10/23/17.
 */
public class UFClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the # of entries");
        int N = Integer.parseInt(scanner.nextLine());
        //UF uf = new UF(N)
        QuickFindUF quickFindUF = new QuickFindUF(10);
        while (scanner.hasNext()) {
            String inp = scanner.nextLine();
            String[] input = inp.split(" ");
            if (input.length == 2) {
                int p = Integer.parseInt(input[0]);
                int q = Integer.parseInt(input[1]);
                if (!quickFindUF.connected(p,q)) {
                    quickFindUF.union(p,q);
                }
            } else {
                System.out.println("not a valid row. proceeding to next row");
            }

        }
    }
}
