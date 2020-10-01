/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.bsp3;

/**
 *
 * @author holzm
 */
//3.Beispiel
public class Main {

    public static void main(String[] args) {

        NumberTester nt = new NumberTester("numbers.txt");

        nt.setOddEvenTester((n) -> n % 2 == 0);
        nt.setPrimeTester((n) -> {
            if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        });
        nt.setPalindromeTester((n) -> {
            String text = Integer.toString(n);
            int length = text.length();
            int forward = 0;
            int backward = length - 1;
            while (backward > forward) {
                char forwardChar = text.charAt(forward++);
                char backwardChar = text.charAt(backward--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
            return true;
        });

        nt.testFile();
    }
}
