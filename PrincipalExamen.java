import javax.swing.JOptionPane;

public class PrincipalExamen{

    public static void main (String [] args) {
        
       int respuesta = JOptionPane.showConfirmDialog(null, "Hola Gamer, juguemos Bucaminas :D \n ¿Estas preparado?", "Buscaminas", JOptionPane.YES_NO_OPTION);
        Bc objeto = new Bc();
        if(respuesta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "*w* Empecemos wiiiiii");
            objeto.Inicio();
        }else{
            JOptionPane.showMessageDialog(null, "UnU Regresa pronto o lloro");
        }
    }
}
