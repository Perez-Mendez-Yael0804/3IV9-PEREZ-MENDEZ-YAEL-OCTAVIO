/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzita;

/**
 *
 * @author ypm
 */
import javax.swing.JOptionPane;
public class Pizzita {
 
    private String masita;
    private String [] salcha;
    protected String [] ingredientes;
    
    public Pizzita(){
    //constructor de pizzita
    }
    
    public Pizzita(String masita, String [] salcha, String [] ingredientes){
        this.masita = masita;
        this.salcha = salcha;
        this.ingredientes = ingredientes;
    }
    
    //getters y setters
    
    public String getMasita(){
        return masita;
    }
    
    public void setMasita(String masita){
        this.masita = masita;
    }
    
    public String [] getSalcha(){
        return salcha;
    }
    
    public void setSalcha(String [] salcha){
        this.salcha = salcha;
    }
    
    public String [] getIngredientes(){
        return ingredientes;
    }
    
    public void setIngredientes(String [] ingredientes){
        this.ingredientes = ingredientes;
    }
    
    public void horno(){
        JOptionPane.showMessageDialog(null, "Se hornea en 25 min");
    }
    
    public void corto(){
        JOptionPane.showMessageDialog(null, "La pizza se corta en 12 triangulitos :3");      
    }
    
    public void empacar(){
        JOptionPane.showMessageDialog(null, "La pizza se empaca en una cajita feliz c:");
    }
}
