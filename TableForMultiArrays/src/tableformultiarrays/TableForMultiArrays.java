/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableformultiarrays;

/**
 *
 * @author Steven
 */
public class TableForMultiArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int firstArray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int secondArray[][] = {{30, 31, 32, 33}, {34}, {4, 5, 6}};
        
        System.out.println("This is the first array");
        display(firstArray);
        
        System.out.println();
        
        System.out.println("This is the second array");
        display(secondArray);
    }

    public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
                
            }
            System.out.println();
        }
    }
}
