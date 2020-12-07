/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzita;

import javax.swing.JOptionPane;

/**
 *
 * @author ypm
 */
public class Vegetariana extends Pizzita{
    
    public Vegetariana(){
        //constructor de vegetariana
    }
    
    public Vegetariana(String masita, String[] salcha, String[] ingredientes) {
        super(masita, salcha, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
        
    }
    
    public Vegetariana(String masa){
        //aqui pueda modificar el comportamiento de la masa
    }
    
    int precio, costo, tamano, num1;
    String num;
    public void tamano(){
    
        String tama = JOptionPane.showInputDialog(null, "Elije el tamaño de tu pizza: \n 1.Chica \n 2. Mediana \n 3.Grande \n 4.Familiar");
        tamano = Integer.parseInt(tama);
        
        switch(tamano){
        
            case 1: 
                JOptionPane.showMessageDialog(null, "Has elegido una pizza chica, se cortara en 4 partes \n Su precio es: $88 ");
                precio = 88;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;      
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,"Has elegido la pizza mediana, se cortara en 8 partes \n Su precio es: $97");
                precio = 97;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Has elegido la pizza grande, se cortara en 12 partes \n Su precio es: $111");
                precio = 111;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null, "Has elegido la pizza familiar, se cortara en 16 partes \n Su precio es: $157");
                precio = 157;
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
