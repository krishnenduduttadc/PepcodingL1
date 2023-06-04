/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author krish
 */
public class LastIndex {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 13, 13,17};
        int k = 13;
        int l = 0;
        int h = arr.length - 1;
        int li=-1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (k > arr[m]) {
                l = m + 1;
            } else if (k < arr[m]) {
                h = m - 1;
            } else {
                
                li = m;
                l = m + 1;
                //break;
            }
        }
        
        System.out.println("" + li);
    }

}
