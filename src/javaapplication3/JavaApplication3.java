/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author CHICO & ICA
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner tc = new Scanner(System.in);

        double a, b, c = 0;
        String soma = "+";
        String subtração = "-";
        String multiplicação = "*";
        String divisão = "/";
        String potência = "^";
        String raiz = "~";
        String operação = "";
        System.out.println("Qual operação deseja fazer ?");
        operação = tc.nextLine();
        System.out.println("insira um numero ó mortal");
        a = tc.nextDouble();
        System.out.println("insira um numero ó mortal");
        b = tc.nextDouble();
        ;
        if (operação == null ? soma == null : operação.equals(soma)) {
            c = a + b;
            System.out.println("o resultado é " + c);
        } else if (operação == null ? subtração == null : operação.equals(subtração)) {
            c = a - b;
            System.out.println("o resultado é " + c);
        } else if (operação == null ? multiplicação == null : operação.equals(multiplicação)) {
            c = a * b;
            System.out.println("o resultado é " + c);
        }
        else 
        c = a/b;
        
            System.out.println("o resultado é " + c);
        }
        
        

    }

