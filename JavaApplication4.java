/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //---boy kilo endeksini gösteren program-----
     
     
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuzu giriniz");
        int kilo = scanner.nextInt();
        System.out.print("boyunuzu giriniz");
        float boy = scanner.nextFloat();
        double ind = kilo/(boy * boy);
        System.out.print(ind);
    }
    
}
