/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author 201911240039
 */
public class app {
    public static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeliveryHomeDate a = new DeliveryHomeDate();
        a.collectDeliveryDetails();
    }
    
}
