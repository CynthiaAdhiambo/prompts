/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cynthia
 */
public class GUI {
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Hello World");
        String name = JOptionPane.showInputDialog(null, "Enter you Name");
        
        System.out.println("You Entered:" + name);
       // System.out.println(name);
    }
    
}
