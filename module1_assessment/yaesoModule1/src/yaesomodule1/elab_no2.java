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
public class elab_no2 {

    public void array() {
        System.out.println();
        System.out.println("answer 2");
        java.util.ArrayList<String> sports = new java.util.ArrayList<>();
        sports.add("Basketball");
        sports.add("Volleyball");
        sports.add("Takraw");
        sports.add("Baseball");
        sports.add("Chess");
        System.out.println("Array");
        System.out.println("My Sports are: " + sports);
        String[] arrayGame = new String[sports.size()];
        sports.toArray(arrayGame);
        System.out.print("My Sports in Array are: ");
        for (String items : arrayGame) {
            System.out.print(items + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
