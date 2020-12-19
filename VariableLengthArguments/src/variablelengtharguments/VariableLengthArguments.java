/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablelengtharguments;

/**
 *
 * @author Steven
 */
public class VariableLengthArguments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(average(1,2,3,4,5));
    }

    public static int average(int... numbers) {
        int total = 0;

        for (int x : numbers) {
            total += x;
        }
        return (total / numbers.length);
    }

}
