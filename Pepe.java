/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzita;

import javax.swing.JOptionPane;

/**
 *
 * @author magga
 */
public class Pepe extends Pizzita {
    
    public Pepe(){
        //constructor de pepe
    }
    
    public Pepe(String masita, String [] salcha, String [] ingredientes){
        super(masita, salcha, ingredientes);
       
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni en Rodajas";
    }
    
    int tamano, precio, costo, num1;
    String num;
    
    public void tamano(){
    
        String tama = JOptionPane.showInputDialog(null, "Elije el tamaño de tu pizza: \n 1.Chica \n 2. Mediana \n 3.Grande \n 4.Familiar");
        tamano = Integer.parseInt(tama);
        
        switch(tamano){
        
            case 1: 
                JOptionPane.showMessageDialog(null, "Has elegido una pizza chica, se cortara en 4 partes \n Su precio es: $96 ");
                precio = 96;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;       
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,"Has elegido la pizza mediana, se cortara en 8 partes \n Su precio es: $119");
                precio = 119;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Has elegido la pizza grande, se cortara en 12 partes \n Su precio es: $131");
                precio = 131;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null, "Has elegido la pizza familiar, se cortara en 16 partes \n Su precio es: $167");
                precio = 167;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Ese tamaño no existe ):");
                break;
        }
        
    }
    
}
