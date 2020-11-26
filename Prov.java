import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prov{

    String nombre;
    String producto [] = new String[10];
    double costo [] = new double [10];  
    double cantidad [] = new double [10];
    double costos = 0.00;
    double mini, maxi; 
    double resul;
    
     public Prov(){
         //constructor de proovedores
     }

    public void Operacion(){
        String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre del cliente");
        for(int i = 0; i < producto.length; i++){
            JOptionPane.showInputDialog(null,"Ingresa el Producto: " + ( i + 1));
        }
        mini = maxi = costo [0];
        for (int j = 0; j < costo.length; j++){
            costo[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el costo del producto " + ( j + 1)));
            
            costos += costo[j];
        }
        mini = maxi = costo [0];
        for (int k = 0; k < costo.length; k++){
            if (costo[k] < mini){
                mini = costo[k];
            }else if (costo[k] > maxi){
                maxi = costo[k];
            }
        }
        resul = costos/costo.length;       

        JOptionPane.showMessageDialog(null, "El nombre del proovedor es: " + nombre);
        JOptionPane.showMessageDialog(null, "El costo total de los productos es: " + costos);
        JOptionPane.showMessageDialog(null, "El promedio de los productos es:  " + resul);
        JOptionPane.showMessageDialog(null, "El producto de mayor costo es:  " + maxi + " y el de menor costo es: " + mini);
        for (int j = 0; j < costo.length; j++){
            JOptionPane.showMessageDialog(null, "El costo del " + (j + 1) + " es: " + costo[j]);
            
        }
        
    }
}