/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import airport.view.AirportFrame;

/**
 *
 * @author Karina
 */
public class Main {

    public static void main(String[] args) {                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AirportFrame frame = new AirportFrame();
                frame.setVisible(true);
            }
        });
    }
}
