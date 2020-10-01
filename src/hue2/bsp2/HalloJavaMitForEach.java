/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.bsp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author holzm
 */
//2.Beispiel
public class HalloJavaMitForEach {

    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add("Hallo");
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::print);
    }
}
