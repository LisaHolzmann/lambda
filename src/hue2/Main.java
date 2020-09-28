/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2;

/**
 *
 * @author holzm
 */
//3.Beispiel
public class Main {

    public static void main(String[] args) {

        NumberTester nt = new NumberTester("numbers.txt");

        nt.setOddEvenTester((n) -> n % 2 == 0);
        nt.setPalindromeTester();
        nt.setPrimeTester();
    }
}
