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
public class Inverse {
    public static void main(String[] args) {
        int[] arr={3,2,1,0};
        int[] inv=new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int v=arr[i];
            inv[v]=i;
            System.out.print(inv[v]+" ");
        }
        
    }
    
}
