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
public class elab_no1 {

    public void char_at() {
        System.out.println();
        System.out.println("ANSWER 1");
        System.out.println("charAt()");
        String str = "YAESO";
        char x = str.charAt(2);
        System.out.println(x);
        System.out.println(str.contains("YAESO"));
        System.out.println(str.contains("yaeso"));
        System.out.println();
    }

    public void index_of() {
        System.out.println();
        System.out.println("indexOf()");
        String g = "YAESO";
        System.out.println("String Content is " + g);
        int a = g.indexOf("A");
        System.out.println("index A is " + a);
        int b = g.indexOf("S");
        System.out.println("index S is " + b);
        System.out.println();
    }
}
