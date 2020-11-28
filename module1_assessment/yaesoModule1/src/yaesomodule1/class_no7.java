/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaesomodule1;

import java.io.File;

/**
 *
 * @author yaeso
 */
public class class_no7 {

    public void no7() {
        System.out.println();
        System.out.println("Answer 7");
        File file = new File("C:\\Users\\yaeso\\Desktop\\");
        String[] fileContent = file.list();
        for (String file_name : fileContent) {
            System.out.println(file_name);
        }

    }

}
