/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringmethod;

/**
 *
 * @author Steven
 */
public class apples {

    private String name;
    private potpie birthday;

    public apples(String theName, potpie theDate) {
        name = theName;
        birthday = theDate;
    }

    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
