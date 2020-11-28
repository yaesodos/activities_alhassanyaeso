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
public class YaesoModule1 {

    public boolean last(String str) {
        int l = str.length();
        String ng = "SO";
        if (l < 2) {
            return false;
        } else if (ng.equals(str.substring(l - 2, l))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        class_no1 no1;
        class_no2 no2;
        class_no3 no3;
        class_no5 no5;
        class_no6 no6;
        class_no7 no7;
        elab_no1 elno1;
        elab_no2 elno2;
        no1 = new class_no1();
        no2 = new class_no2();
        no3 = new class_no3();
        no5 = new class_no5();
        no6 = new class_no6();
        no7 = new class_no7();
        elno1 = new elab_no1();
        elno2 = new elab_no2();

        System.out.println("ELABORATE: Coding");
        elno1.char_at();
        elno1.index_of();
        elno2.array();
        System.out.println("ASSESSMENT");
        no1.no1();
        no2.no2();
        no3.no3();
        System.out.println("");
        System.out.println("Answer 4");
        YaesoModule1 ala = new YaesoModule1();
        String st = "YAESO";
        System.out.println("The given strings is: " + st);
        System.out.println("The string containing SO at last: " + ala.last(st));
        no5.no5();
        no6.no6();
        no7.no7();

    }

}
