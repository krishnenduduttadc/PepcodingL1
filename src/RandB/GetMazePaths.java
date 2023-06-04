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
public class GetMazePaths {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArrayList<String> res = maze(0, 0, arr.length - 1, arr[0].length - 1);
        System.out.println(res);
    }

    static ArrayList<String> maze(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;

        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = maze(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = maze(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String each : hpaths) {
            paths.add("h" + each);
        }
        for (String each : vpaths) {
            paths.add("v" + each);
        }
        return paths;

    }

}
