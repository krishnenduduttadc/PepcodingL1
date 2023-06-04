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
public class Subarrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                            
                }
                System.out.println("");
            }
        }
    }
}
