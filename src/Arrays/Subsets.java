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
public class Subsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int limit=(int)Math.pow(2,arr.length);
        
        for (int i = 0; i < limit; i++) {
            String set="";
            int temp=i;
            for (int j = arr.length-1; j >=0; j--) {
                int r=temp%2;
                temp=temp/2;
                if(r==0){
                    set="-"+set;
                }else{
                    set=arr[j]+set;
                }
            }
            System.out.println(set);
        }
        
    }
    
}
