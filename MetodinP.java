import java.util.Scanner;
import javax.swing.JOptionPane;

//CLASE PRINCIPAL
public class MetodinP{

    public static void main (String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido amigo, disfruta el programa ;D");
     
        Scanner entrada = new Scanner(System.in);
        MetodineS obj = new MetodineS();
        char salir;

        do{
            obj.Menu();
            System.out.println("Si desea repetir el programa digite 's' si no digite cualquier letra");
            salir = entrada.next().charAt(0);
        }while (salir == 's');
    }
}