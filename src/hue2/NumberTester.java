/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author holzm
 */
//3.Beispiel
public class NumberTester {

    private String fileName;
    private int testfaelle;
    private List<Integer[]> zahlen = new ArrayList<>();

    public NumberTester(String fileName) {
        this.fileName = fileName;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = br.readLine();
            testfaelle = Integer.parseInt(line);
            line = br.readLine();
            while (line != null) {
                String[] splitted = line.split(" ");
                zahlen.add(new Integer[]{Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1])});
                line = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setOddEvenTester(NumberTest oddTester) {

    }

    public void setPrimeTester(NumberTest primeTester) {
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
    }

    public void testFile() {
    }
}
