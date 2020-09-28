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
            String clean = text.replaceAll("\\s+", "").toLowerCase();
            int length = clean.length();
            int forward = 0;
            int backward = length - 1;
            while (backward > forward) {
                char forwardChar = clean.charAt(forward++);
                char backwardChar = clean.charAt(backward--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
            return true;
        });

        nt.testFile();
    }
}
