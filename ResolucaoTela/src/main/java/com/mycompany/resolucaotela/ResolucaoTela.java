/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Fábio Brasileiro
 */
public class ResolucaoTela {
    
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension r = tk.getScreenSize();
        System.out.print("A resolução da sua tela é ");
        System.out.println(r.toString());        

              
             
    }
    
}
