/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumingelementsofarray;

/**
 *
 * @author Steven
 */
public class SumingElementsOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int steven[] = {21, 16, 15, 80, 55};
        int sum = 0;

        for (int i = 0; i < steven.length; i++) {
            sum += steven[i];
        }

        System.out.println("The sum of these numbers are: " + sum);
    }

}
