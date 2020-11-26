import javax.swing.JOptionPane;

//CLASE PRINCIAL 
public class Principal{

    public static void main (String[] args) {
        int salir;
        do{ 
            //Aqui vamos a invocar a las clases, metodos y objetos
            String opcion = JOptionPane.showInputDialog(null, "Elije una de las siguientes opciones: \n 1.Sueldos\n 2.Proovedores\n 3.Libros");
            int opc = Integer.parseInt(opcion);
            Sueldo obj = new Sueldo();
            Prov obje = new Prov();
            Libros ob = new Libros();
            

        
            switch (opc) {
                case 1:
                    obj.Menu1();
                    break;
                
                case 2:
                    obje.Operacion();
                    break;
                case 3:
                    ob.Prestamo();
                    break;
            }
            salir = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija la opcion deseada si desea repetir el programa: \n1. Si.\n2. No. "));
        }while (salir != 2);
    }
}