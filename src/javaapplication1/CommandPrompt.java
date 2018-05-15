/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cynthia
 */
public class CommandPrompt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = input.next();
        System.out.println(name);
        JOptionPane.showMessageDialog(null, "You Entered" +name);
    }
    
}
