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
public class Spiral {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = arr.length * arr[0].length;
        int cnt = 0;

        while (cnt < tne) {
            for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            for (int i = minr, j = maxc; j >= minc && cnt < tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;

        }
    }

}
