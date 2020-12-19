/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multideminsionalarray;

/**
 *
 * @author Steven
 */
public class MultideminsionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int firstArray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int secondArray[][] = {{30, 31, 32, 33}, {34}, {4, 5, 6}};
        
        
        System.out.println(secondArray[1][0]);
        
        System.out.println(secondArray[2][2]);
    }

}
