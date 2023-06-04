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
public class Rotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=3;
        if(n>arr.length){
            n=n%arr.length;
        }
        
        //p1 0 to arr.l-n-1
        reverse(arr,0,arr.length-n-1);
        
        //p2 arr.l-n to arr.l-1
        reverse(arr,arr.length-n,arr.length-1);
        
        //total
        reverse(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
    static void reverse(int[] arr,int i,int j){
        int li=i;
        int ri=j;
        while(li<ri){
            int tmp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=tmp;
            li++;
            ri--;
        }
    }
    
}
