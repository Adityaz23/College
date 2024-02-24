// Q. Key element in the array.

import java.util.Scanner;

public class Element {

    public static void main(String[] args) {

        System.out.println("Please enter the key which you want to find: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] a = {11,21,23,234,543};

        boolean found = false;
        for (int j : a) {
            if (j == key) {
                found = true;
                System.out.println(j + " is in the array.");
            }
        }
        if (found == false){
            System.out.println( key +" Element is not in the array");
        }


    }
}
