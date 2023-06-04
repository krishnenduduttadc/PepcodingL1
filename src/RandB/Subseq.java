/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandB;

import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class Subseq {
    public static void main(String[] args) {
        ArrayList<String> res=gss("abc");
        System.out.println(res);
    }
    static ArrayList<String> gss(String s){
        if(s.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> rres=gss(ros);
        ArrayList<String> mres=new ArrayList<>();
        for(String each: rres){
            mres.add("_"+each);
        }
        for(String each: rres){
            mres.add(ch+each);
        }
        return mres;
    }
    
}
