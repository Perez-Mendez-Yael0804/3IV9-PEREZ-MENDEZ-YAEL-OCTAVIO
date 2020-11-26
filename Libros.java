import javax.swing.JOptionPane;

public class Libros{
    int  li, Li1, Li2, Li3, Li4, Li5, Lp1, Lp2, Lp3, Lp4, Lp5, prestado, pre;
    String libro, pr;

    public Libros(){
        //constructor de libros
    }

    public void Prestamo(){

        String opcion =JOptionPane.showInputDialog(null, "Elije a uno de los libros disponibles:  \n 1.Viaje al centro de la Tierra \n 2.De la Tierra a la Luna \n 3.Dinosaurios \n 4.Anatomia Humana \n 5.Java para principeiantes" );
        int opc = Integer.parseInt(opcion);
        
        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "Libro: Viaje al Centro de la Tierra  \n Autor: Julio Verne  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 7");
                libro =JOptionPane.showInputDialog(null, "Presiona el numero para la operacion que desees:  \n 1.Prestamo de un libro :3 \n 2.Devolucion de un libro");
                li = Integer.parseInt(libro);
                switch (li) {
                    case 1:
                        Librito();   
                        break;
                    case 2:
                        Devolucion();
                    default:
                        break;
                }
                break;
            case 2: 
                JOptionPane.showMessageDialog(null, "Libro: De la Tierra a la Luna  \n Autor: Julio Verne  \n No. Ejemplares: 10 \n No. Ejemplares prestados: 5 ");
                libro = JOptionPane.showInputDialog(null, "Presiona el numero para la operacion que desees:  \n 1.Prestamo de un libro :3 \n 2.Devolucion de un libro");
                li = Integer.parseInt(libro);
                switch (li) {
                    case 1:
                        Librito();   
                        break;
                    case 2:
                        Devolucion();
                    default:
                        break;
                }
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Libro: Dinosaurios  \n Autor: Renee Rios  \n No. Ejemplares: 7 \n No. Ejemplares prestados: 4");
                libro = JOptionPane.showInputDialog(null, "Presiona el numero para la operacion que desees:  \n 1.Prestamo de un libro :3 \n 2.Devolucion de un libro");
                li = Integer.parseInt(libro);
                switch (li) {
                    case 1:
                        Librito();   
                        break;
                    case 2:
                        Devolucion();
                    default:
                        break;
                }
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Libro: Anatomia Humana  \n Autor: Carlos Tellez  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 9");
                libro = JOptionPane.showInputDialog(null, "Presiona el numero para la operacion que desees:  \n 1.Prestamo de un libro :3 \n 2.Devolucion de un libro");
                li = Integer.parseInt(libro);
                switch (li) {
                    case 1:
                        Librito();   
                        break;
                    case 2:
                        Devolucion();
                    default:
                        break;
                }
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Libro: Java para Principiantes  \n Autor: Jaime Minor :3  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 15 ");
                libro = JOptionPane.showInputDialog(null, "Presiona el numero para la operacion que desees:  \n 1.Prestamo de un libro :3 \n 2.Devolucion de un libro");
                li = Integer.parseInt(libro);
                switch (li) {
                    case 1:
                        Librito();   
                        break;
                    case 2:
                        Devolucion();
                    default:
                        break;
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Lo sentimos ese libro no esta disponible ):");
                break;
        }
    }


    public void Librito(){
        String opcion =JOptionPane.showInputDialog(null, "¿Que libro quieres pedir prestado?:  \n 1.Viaje al centro de la Tierra \n 2.De la Tierra a la Luna \n 3.Dinosaurios \n 4.Anatomia Humana \n 5.Java para principeiantes" );
        int opc = Integer.parseInt(opcion);
        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "Libro: Viaje al Centro de la Tierra  \n Autor: Julio Verne  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 7");
                Li1 = 15;
                Lp1 = 7;
                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres llevarte");
                pre = Integer.parseInt(pr);

                prestado = Li1 - Lp1 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha pedido prestado: " + pre + "Libros y quedan: " + prestado + "Ejemplares");
                }
                break;
                case 2: 
                JOptionPane.showMessageDialog(null, "Libro: De la Tierra a la Luna  \n Autor: Julio Verne  \n No. Ejemplares: 10 \n No. Ejemplares prestados: 5");
                Li2 = 10;
                Lp2 = 5;
                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres llevarte");
                pre = Integer.parseInt(pr);

                prestado = Li2 - Lp2 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha pedido prestado: " + pre + "Libros y quedan: " + prestado + "Ejemplares");
                }
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Libro: Dinosaurios  \n Autor: Renee Rios  \n No. Ejemplares: 7 \n No. Ejemplares prestados: 4 ");
                Li3 = 7;
                Lp3 = 4;

                String pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres llevarte");
                int pre = Integer.parseInt(pr);

                prestado = Li3 - Lp3 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha pedido prestado: " + pre + "Libros y quedan: " + prestado + "Ejemplares");
                }
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Libro: Anatomia Humana  \n Autor: Carlos Tellez  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 9 ");
                Li4 = 15;
                Lp4 = 9;
                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres llevarte");
                pre = Integer.parseInt(pr);

                prestado = Li4 - Lp4 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quieres supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha pedido prestado: " + pre + "Libros y quedan: " + prestado + "Ejemplares");
                }
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Libro: Java para Principiantes  \n Autor: Jaime Minor :3  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 15 ");
                Li5 = 15;
                Lp5 = 15;

                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres llevarte");
                pre = Integer.parseInt(pr);

                prestado = Li5 - Lp5 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha pedido prestado: " + pre + "Libros y quedan: " + prestado + "Ejemplares");
                }
                break;                
            default:
                break;
        }
    }

    public void Devolucion(){
        String opcion =JOptionPane.showInputDialog(null, "¿Que libro quieres devolver:  \n 1.Viaje al centro de la Tierra \n 2.De la Tierra a la Luna \n 3.Dinosaurios \n 4.Anatomia Humana \n 5.Java para principeiantes" );
        int opc = Integer.parseInt(opcion);

        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "Libro: Viaje al Centro de la Tierra  \n Autor: Julio Verne  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 7");
                Li1 = 15;
                Lp1 = 7;
                String pr = JOptionPane.showInputDialog(null, "Digita la cantidad de libros que quieres devolver");
                int pre = Integer.parseInt(pr);

                prestado = Li1 - Lp1 + pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere devolver supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha devuelto: " + pre + " Libros y quedan: " + prestado + " Ejemplares por ser devueltos");
                }
                break;
            case 2: 
                JOptionPane.showMessageDialog(null, "Libro: De la Tierra a la Luna  \n Autor: Julio Verne  \n No. Ejemplares: 10 \n No. Ejemplares prestados: 5");
                Li2 = 10;
                Lp2 = 5;
                pr = JOptionPane.showInputDialog(null, "Digita la cantidad de libros que quieres devolver");
                pre = Integer.parseInt(pr);

                prestado = Li2 - Lp2 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere devolver supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha devuelto: " + pre + " Libros y quedan: " + prestado + " Ejemplares por ser devueltos");
                }
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Libro: Dinosaurios  \n Autor: Renee Rios  \n No. Ejemplares: 7 \n No. Ejemplares prestados: 4 ");
                Li3 = 7;
                Lp3 = 4;

                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres devolver");
                pre = Integer.parseInt(pr);

                prestado = Li3 - Lp3 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere devolver supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha devuelto: " + pre + " Libros y quedan: " + prestado + " Ejemplares por ser devueltos");
                }
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Libro: Anatomia Humana  \n Autor: Carlos Tellez  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 9 ");
                Li4 = 15;
                Lp4 = 9;
                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres devolver");
                pre = Integer.parseInt(pr);

                prestado = Li4 - Lp4 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere devolver supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha devuelto: " + pre + " Libros y quedan: " + prestado + " Ejemplares por ser devueltos");
                }
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Libro: Java para Principiantes  \n Autor: Jaime Minor :3  \n No. Ejemplares: 15 \n No. Ejemplares prestados: 15 ");
                Li5 = 15;
                Lp5 = 15;

                pr = JOptionPane.showInputDialog(null, "Escribe la cantidad de libros que quieres devolver");
                pre = Integer.parseInt(pr);

                prestado = Li5 - Lp5 - pre;
                if(prestado <= 0){
                    JOptionPane.showMessageDialog(null, "Lo sentimos la cantidad de libros que quiere devolver supera el numero de ejemplares ):");
                }else{
                    JOptionPane.showMessageDialog(null, "Usted ha pedido devuelto: " + pre + " Libros y quedan: " + prestado + " Ejemplares por ser devueltoss");
                }
                break;                
            default:
                JOptionPane.showMessageDialog(null, "Lo sentimos este numero no esta disponible ):");
                break;
        }        
    }
}