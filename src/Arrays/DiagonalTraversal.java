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
public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };
        
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0,j=g; j<arr.length; i++,j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
