/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysinmethods;

/**
 *
 * @author Steven
 */
public class ArraysInMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int steven[] = {3, 4, 5, 6, 7, 8};
        change(steven);
        
        for(int x : steven){
            System.out.println(x);
        }
    }

    public static void change(int x[]) {
        for (int counter = 0; counter < x.length; counter++) {
            x[counter] += 5;
        }

    }
}
