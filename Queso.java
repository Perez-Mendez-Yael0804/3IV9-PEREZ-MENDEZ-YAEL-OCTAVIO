/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzita;

/**
 *
 * @author magga
 */

import javax.swing.JOptionPane;
public class Queso extends Pizzita {
    
    public Queso(){
        //Constructorcito de queso 
    }
    
    public Queso(String masita, String[] salcha, String[] ingredientes) {
        super(masita, salcha, ingredientes);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }
    
    //queremos elegir un tipo de queso
    public void elegirtipoqueso(){
        //es un metodo void, o string?
        
        int queso;
        String quesito = JOptionPane.showInputDialog(null, "Elije el queso que deseas \n 1.Parmesano \n 2.Mozzarela");
        queso = Integer.parseInt(quesito);
        
        switch (queso){
            
            case 1: 
                JOptionPane.showMessageDialog(null, "Ha elegido el Parmesano :D");
                tamano();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Ha elegido el Mozzarela");
                tamano2();
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Este queso no existe tienes gustos raros");
                break;
        }
        
    }
    
    
    int precio, costo, tamano, num1;
    String num;
    public void tamano(){
    
        String tama = JOptionPane.showInputDialog(null, "Elije el tamaño de tu pizza: \n 1.Chica \n 2. Mediana \n 3.Grande \n 4.Familiar");
        tamano = Integer.parseInt(tama);
        
        switch(tamano){
        
            case 1: 
                JOptionPane.showMessageDialog(null, "Has elegido una pizza chica, se cortara en 4 partes \n Su precio es: $89 ");
                precio = 89;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;  
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,"Has elegido la pizza mediana, se cortara en 8 partes \n Su precio es: $115");
                precio = 115;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Has elegido la pizza grande, se cortara en 12 partes \n Su precio es: $135");
                precio = 135;
                num = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num1 = Integer.parseInt(num);
                costo = precio * num1;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo);
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null, "Has elegido la pizza familiar, se cortara en 16 partes \n Su precio es: $175");
                precio = 175;
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
    
    int precio2, costo2, tamano2, num2;
    String numa;
    public void tamano2(){
    
        String ta = JOptionPane.showInputDialog(null, "Elije el tamaño de tu pizza: \n 1.Chica \n 2. Mediana \n 3.Grande \n 4.Familiar");
        tamano2 = Integer.parseInt(ta);
        
        switch(tamano2){
        
            case 1: 
                JOptionPane.showMessageDialog(null, "Has elegido una pizza chica, se cortara en 4 partes \n Su precio es: $75 ");
                precio2 = 75;
                numa = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num2 = Integer.parseInt(numa);
                costo2 = precio2 * num2; 
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo2);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,"Has elegido la pizza mediana, se cortara en 8 partes \n Su precio es: $89");
                precio2 = 89;
                numa = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num2 = Integer.parseInt(numa);
                costo2 = precio2 * num2;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo2);
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Has elegido la pizza grande, se cortara en 12 partes \n Su precio es: $112");
                precio2 = 112;
                numa = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num2 = Integer.parseInt(numa);
                costo2 = precio2 * num2;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo2);
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null, "Has elegido la pizza familiar, se cortara en 16 partes \n Su precio es: $135");
                precio2 = 135;
                numa = JOptionPane.showInputDialog(null, "¿Cuantas pizzas vas a querer?");
                num2 = Integer.parseInt(numa);
                costo = precio2 * num2;
                JOptionPane.showMessageDialog(null, "El costo total es de: " + costo2);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Ese tamaño no existe ):");
                break;
        }
        
    }
    
}
