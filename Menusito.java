/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriapapalui;

/**
 *
 * @author ypm 
 */

import Pizzita.*;
import java.util.Scanner;
public class Menusito {
    
    public void Menu(){
        Scanner entrada = new Scanner(System.in);
        int opc;
        Pizzita pizza = null;
        
        do{
            System.out.println("Bienvenidos a la Pizzeria Los Tacos");
            System.out.println("¿Que desea ordenar?");
            System.out.println("1.- Pizza de Queso");
            System.out.println("2.- Pizza de Peperoni");
            System.out.println("3.- Pizza de Vegetariana");
            System.out.println("Gracias uwu");

            opc = entrada.nextInt();
            
            switch (opc){
                case 1:
                    pizza = new Queso();
                    Queso quesito = new Queso();
                    quesito.elegirtipoqueso();
                    pizza.horno();
                    pizza.empacar();
                    break;
                    
                case 2: 
                    pizza = new Pepe();
                    Pepe pep = new Pepe();
                    pep.tamano();
                    pizza.horno();
                    pizza.empacar();
                    break;
                    
                case 3: 
                    pizza = new Vegetariana();
                    Vegetariana ve = new Vegetariana();
                    ve.tamano();
                    pizza.horno();
                    pizza.empacar();
                    break;
            }
        }while(opc != 4);
    }
}

