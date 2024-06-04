/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gymapplication;

/**
 *
 * @author Mohammad Alqasem
 */


import javax.swing.*;

public class GymApplication extends javax.swing.JFrame {
     public void login(){} ;
     
   public static void main(String[] args) {
   
   try {
     
      String className = "com.mycompany.gymapplication.GYMJFrame";
      Class<?> clazz = Class.forName(className);
      Object instance = clazz.newInstance();

      // Assuming the frame has a setVisible method
      ((JFrame) instance).setVisible(true);
        System.out.println("the GymApplication started");
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
}
}
 