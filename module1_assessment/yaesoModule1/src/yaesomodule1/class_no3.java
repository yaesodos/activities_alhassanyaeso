/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaesomodule1;

/**
 *
 * @author yaeso
 */
public class class_no3 {

    public void no3() {
        System.out.println();
        System.out.println("Answer 3");
        int[] evens = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        double add = 0;
        for (int i = 0; i < evens.length; i++) {
            add = add + evens[i];
        }
        double ave = add / evens.length;
        System.out.println("Average : " + ave);

    }
}
