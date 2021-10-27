/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capturarlinguagem;

import java.util.Locale;

/**
 *
 * @author Fábio Brasileiro
 */
public class CapturarLinguagem {
    
    public static void main(String[] args) {
        Locale language = Locale.getDefault();
        System.out.print("A linguagem do programa é ");
        System.out.println(language.toString());
        
    }
}
