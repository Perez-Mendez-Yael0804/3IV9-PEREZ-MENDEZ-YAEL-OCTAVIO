import java.util.Scanner;
//CLASE PRINCIPAL

public class Arreglos{

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        Anid obj = new Anid();
        char salir;

        do{
            obj.menu();
            System.out.println("Si desea repetir el programa digite 's'");
            salir = entrada.next().charAt(0);
        }while (salir == 's');
        
    }

}