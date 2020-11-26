import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sueldo{

    Scanner entrada = new Scanner(System.in);
    String id, d, hrx1, hrx2, hrd1, hrd2;
    int s1 = 5000, s2 = 8000, consulta;
    double isr, info, segu;
    double resul;

    public Sueldo(){
        //constructor de sueldo
    }

    
    public void Menu1(){
        String opcion =JOptionPane.showInputDialog(null, "Elije a uno de los empleados disponibles para saber su sueldo:  \n 1.Edgar Arreola \n 2.Ximena Tellez \n 3.Adrian Vazquez" );
        int opc = Integer.parseInt(opcion);

        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "Para consultar el salario del empleado recuerda el ID o copialo y pegalo");
                JOptionPane.showMessageDialog(null, "Has elegido a Edgar. \n ID: 180579 \n Puesto: Empleado.");
                System.out.println("Si deseas consultar el salario del empleado presiona 1 si no presiona cualquier tecla");    
                consulta = entrada.nextInt();
                switch (consulta) {
                    case 1:
                        Salario();                        
                        break;
                
                    default:
                        System.out.println("Vuelve pronto :D");
                        break;
                }    
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Para consultar el salario del empleado recuerda el ID o copialo y pegalo");
                JOptionPane.showMessageDialog(null, "Has elegido a Ximena. \n ID: 180685 \n Puesto: Supervisor.");
                System.out.println("Si deseas consultar el salario del empleado presiona 1 si no presiona cualquier tecla");    
                consulta = entrada.nextInt();
                switch (consulta) {
                    case 1:
                        Salario();                        
                        break;
                
                    default:
                        System.out.println("Vuelve pronto :D");
                        break;
                }    
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null, "Para consultar el salario del empleado recuerda el ID o copialo y pegalo");
                JOptionPane.showMessageDialog(null, "Has elegido a Adrian. \n ID: 180793 \n Puesto: Empleado.");
                System.out.println("Si deseas consultar el salario del empleado presiona 1 si no presiona cualquier tecla");    
                consulta = entrada.nextInt();
                switch (consulta) {
                    case 1:
                        Salario();                        
                        break;
                
                    default:
                        System.out.println("Vuelve pronto :D");
                        break;
                }    
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lo sentimos por el momento no se encuentran mas empleados disponibles UnU");
                break;
                
        }

    } 
    
    public void Salario() {
       String d = JOptionPane.showInputDialog(null, "Ingresa el ID del empleado");
       int id = Integer.parseInt(d);
            
        if(id == 180579){
          String hrd1 = JOptionPane.showInputDialog(null, "Ingresa las hrs extras diurnas");
          double hrd2 = Double.parseDouble(hrd1);
          hrd2 *= 50;
          String hrx1 = JOptionPane.showInputDialog(null,"Ingresa las hrs extras nocturnas");
          double hrx2 = Double.parseDouble(hrx1);
          hrx2 *= 60;
          resul = hrd2 + hrx2;
          s1 += resul; 
          JOptionPane.showMessageDialog(null, "Nombre: Edgar Arreola \n Puesto: Empleado \n Salario: " + s1);
        }
        if(id == 180793){
            String hrd1 = JOptionPane.showInputDialog(null, "Ingresa las hrs extras diurnas");
            double hrd2 = Double.parseDouble(hrd1);
            hrd2 *= 50;
            String hrx1 = JOptionPane.showInputDialog(null,"Ingresa las hrs extras nocturnas");
            double hrx2 = Double.parseDouble(hrx1);
            hrx2 *= 60;
            resul = hrd2 + hrx2;
            s1 += resul; 
            JOptionPane.showMessageDialog(null, "Nombre: Adrian Vazquez \n Puesto: Empleado \n Salario: " + s1);
        }
        if(id == 180685){
            isr = s2*.16;
            info = s2*.2;
            segu = s2*1;
            resul = isr + info + segu;
            s2 -= resul;
            JOptionPane.showMessageDialog(null, "Nombre: Ximena Tellez \n Puesto: Supervisor \n Salario: " + s1);
        }
        if (id != 180685 && id != 180793 && id !=180579){
            JOptionPane.showMessageDialog(null,"Lo sentimos el empleado que busca no esta disponible o no existe ):");
        }

    }
}