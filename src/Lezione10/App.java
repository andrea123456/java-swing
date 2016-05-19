/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tss
 */
public class App {
    public static void main(String[]args) {
        JFrame f = new JFrame("Esempio swing");
        
        f.setBounds(100, 100, 300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contenPane = f.getContentPane();
        JButton cmd = new JButton("invia");
        contenPane.add(cmd);
        JButton cmd1 = new JButton("invia1");
        contenPane.add(cmd1);
        cmd1.setPreferredSize(new Dimension(200, 50));
        contenPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        cmd.setBounds(50, 50, 100, 50);
        f.setVisible(true);
        
        
     
       }
}
