/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.bsp4;

import java.util.Scanner;

/**
 *
 * @author holzm
 */
//4.Beispiel
public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "Windows-1252");

        //add
        RationalCalculator rc = new RationalCalculator((a, b) -> {
            double zaehler = a.getA() * b.getB() + b.getA() * a.getB();
            double nenner = a.getB() * b.getB();
            Number number = new Number();
            number.setA(zaehler);
            number.setB(nenner);
            return number;
            //sub
        }, (a, b) -> {
            double zaehler = a.getA() * b.getB() - b.getA() * b.getB();
            double nenner = a.getB() * b.getA() + b.getB() * a.getA();
            Number number = new Number();
            number.setA(zaehler);
            number.setB(nenner);
            return number;
            //mul
        }, (a, b) -> {
            double zaehler = a.getA() * b.getA();
            double nenner = a.getB() * b.getB();
            Number number = new Number();
            number.setA(zaehler);
            number.setB(nenner);
            return number;
            //div
        }, (a, b) -> {
            double zaehler = a.getA() * b.getB();
            double nenner = a.getB() * b.getA();
            Number number = new Number();
            number.setA(zaehler);
            number.setB(nenner);
            return number;
        });

        //add
        VectorCalculator vc = new VectorCalculator((a, b) -> {
            double x = a.getA() + b.getA();
            double y = b.getB() + b.getB();
            Number number = new Number();
            number.setA(x);
            number.setB(y);
            return number;
            //sub
        }, (a, b) -> {
            double x = a.getA() - b.getA();
            double y = a.getB() - b.getB();
            Number number = new Number();
            number.setA(x);
            number.setB(y);
            return number;
            //mul
        }, (a, b) -> {
            double zaehler = a.getA() * b.getB() + a.getB() * b.getA();
            Number number = new Number();
            number.setA(zaehler);
            number.setB(1);
            return number;
            //div
        }, (a, b) -> {
            double zaehler = a.getA() * b.getA() + a.getB() + b.getB();
            Number number = new Number();
            number.setA(zaehler);
            number.setB(1);
            return number;
        });
        //a-reeller Teil, b-imaginaerer Teil
        //add
        ComplexCalculator cc = new ComplexCalculator((a, b) -> {
            double x = a.getA() + b.getB();
            double y = a.getB() + b.getB();
            Number number = new Number();
            number.setA(x);
            number.setB(y);
            return number;
            //sub
        }, (a, b) -> {
            double x = a.getA() - b.getB();
            double y = a.getB() - b.getB();
            Number number = new Number();
            number.setA(x);
            number.setB(y);
            return number;
            //mul
        }, (a, b) -> {
            double x = a.getA() * b.getA() - a.getB() * b.getB();
            double y = a.getA() * b.getA() + a.getB() * b.getB();
            Number number = new Number();
            number.setA(x);
            number.setB(y);
            return number;
            //div
        }, (a, b) -> {
            double nenner = b.getA() * b.getA() + b.getB() + b.getB();
            double x = (a.getA() * b.getA() + a.getB() * b.getB()) / nenner;
            double y = (a.getB() * b.getA() - a.getA() * b.getB()) / nenner;
            Number number = new Number();
            number.setA(x);
            number.setB(y);
            return number;
        });

        menu();
        int ausw = Integer.parseInt(scanner.nextLine());

        while (ausw < 4) {

            int operation;
            int xa;
            int xb;
            int ya;
            int yb;
            do {
                System.out.print("Nummer eigeben x a: \n");
                xa = Integer.parseInt(scanner.nextLine());
                System.out.print("Nummer eingeben x b: \n");
                xb = Integer.parseInt(scanner.nextLine());
                System.out.print("Nummer eingeben y a: \n");
                ya = Integer.parseInt(scanner.nextLine());
                System.out.print("Nummer eingeben y b: \n");
                yb = Integer.parseInt(scanner.nextLine());

                System.out.println("Choose operation:");
                System.out.println("1.. add");
                System.out.println("2.. subtract");
                System.out.println("3.. multiply");
                System.out.println("4.. divide");
                System.out.println("5.. enter numbers again");

                operation = Integer.parseInt(scanner.nextLine());
            } while (operation == 5);

            Number number1 = new Number();
            number1.setA(xa);
            number1.setB(xb);
            Number number2 = new Number();
            number2.setA(ya);
            number2.setB(yb);
            Number erg = new Number();

            switch (ausw) {
                case 1:

                    switch (operation) {
                        case 1:

                            erg = rc.add(number1, number2);
                            break;
                        case 2:

                            erg = rc.subtract(number1, number2);
                            break;
                        case 3:

                            erg = rc.multiply(number1, number2);
                            break;
                        case 4:

                            erg = rc.divide(number1, number2);
                            break;

                        case 5:
                            System.out.print("Nummer eigeben x a: \n");
                            xa = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nummer eingeben x b: \n");
                            xb = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nummer eingeben y a: \n");
                            ya = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nummer eingeben y b: \n");
                            yb = Integer.parseInt(scanner.nextLine());

                            number1 = new Number();
                            number1.setA(xa);
                            number1.setB(xb);
                            number2 = new Number();
                            number2.setA(ya);
                            number2.setB(yb);
                            erg = new Number();
                            break;

                    }
                    break;

                case 2:

                    switch (operation) {
                        case 1:

                            erg = vc.add(number1, number2);
                            break;
                        case 2:

                            erg = vc.subtract(number1, number2);
                            break;
                        case 3:

                            erg = vc.multiply(number1, number2);
                            break;
                        case 4:

                            erg = vc.divide(number1, number2);
                            break;
                        default:

                            break;
                    }
                    ;
                    break;
                case 3:
                    switch (operation) {
                        case 1:

                            erg = cc.add(number1, number2);
                            break;
                        case 2:

                            erg = cc.subtract(number1, number2);
                            break;
                        case 3:

                            erg = cc.multiply(number1, number2);
                            break;
                        case 4:

                            erg = cc.divide(number1, number2);
                            break;
                        default:

                            break;
                    }
                    ;
                    break;
                case 4:
                    System.exit(0);
            }

            System.out.println("Solution:");
            System.out.println("a : " + erg.getA());
            System.out.println("b : " + erg.getB());
            menu();
            ausw = Integer.parseInt(scanner.nextLine());

        }
    }

    private static void menu() {
        System.out.println("Choose calculator:");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit");
    }

}
