import javax.swing.JOptionPane;
import java.util.Scanner;

public class MetodineS{

    Scanner entrada = new Scanner(System.in);

    public void Menu(){
        
        //Menu desplegable
        JOptionPane.showMessageDialog(null,"Selecciona las siguientes opciones.");
        String opcion = JOptionPane.showInputDialog(null, "1.Calcular Edad, 2.Areas y Perimetros, 3.Compania Celular");
        int opc = Integer.parseInt(opcion);

          //Opciones del menu
        switch (opc) {
            case 1:
                Edad();
                break;
            case 2:
                AP();
                break;
            
            case 3:
                Cc();
                break;

            default:
                JOptionPane.showMessageDialog(null,"Vuelve pronto nwn/");
                break;
        }
    }

    //Primera opcion
    public void Edad(){
        
        int anio1, aniof, mes1, mes2, edad1, edad2;

        System.out.println("Solo introduzca anios d.C.");
        do{
            System.out.println("Ingrese el anio de nacimiento");
            anio1 = entrada.nextInt();
        }while (anio1 < 0);
        do{ 
            System.out.println("Ingrese el mes de nacimiento");
            mes1 = entrada.nextInt();
        }while (mes1 <= 0 || mes1 > 12);
        do{ 
            System.out.println("Ingrese el anio actual");
            aniof = entrada.nextInt();
        }while (aniof < 0);
        do{ 
            System.out.println("Ingrese el mes actual");
            mes2 = entrada.nextInt();
        }while (mes2 <= 0 || mes2 > 12);

        edad1 = aniof-anio1;
        edad2 = mes2-mes1;
        if (edad1 < 0){
            System.out.println("El año de nacimiento no puede ser mayor al actual");
        } 
        if (edad2 < 0){
            edad2 = 12+edad2;
            edad1 -= 1;
            System.out.println("Su edad es de: " + edad1 + " anios y " + edad2 + "meses.");
        }else if (edad2 > 0){
            System.out.println("Su edad es de: " + edad1 + " anios y " + edad2 + "meses.");
        }
            
        
        
        
    }

    //Sengunda Opcion
    public void AP(){

        double base1, base2, area, perime, resultado1, resultado2, radio, a;
        int operacion;
        //Opciones del menu anidado 
        System.out.println("Elija  la opcion deseada: ");
        System.out.println("1. Area y Perimetro del Circulo");
        System.out.println("2. Area y Perimetro del Rectangulo");
        System.out.println("3. Area y Perimetro del Triangulo");
        System.out.println("4. Area y Perimetro del Cuadrado");
        operacion = entrada.nextInt();

        //Opreaciones del menu 
        switch (operacion) {
            case 1:
                do{ 
                    System.out.println("Solo se aceptan numeros enteros positivos");
                    System.out.println("Ingresa el valor del radio");
                    radio = entrada.nextDouble();
                }while (radio <=0);
                resultado1 = Math.PI*(radio*radio);
                resultado2 = Math.PI*(radio*2);
                System.out.println("El valor del area del circulo es: " + resultado1 + " y del perimetro: " + resultado2);
                break;
            
            case 2:
                do{ 
                    System.out.println("Solo se aceptan numeros enteros positivos");
                    System.out.println("Ingrese el valor de la base");
                    base1 = entrada.nextDouble();
                }while (base1 <=0);
                do{ 
                    System.out.println("Solo se aceptan numeros enteros positivos");
                    System.out.println("Ingrese el valor de la altura");
                    base2 = entrada.nextDouble();
                }while (base2 <=0);
                resultado1 = base1*base2;
                resultado2 = (base1*2) + (base2*2);
                System.out.println("El valor del area es: " + resultado1 + " y del perimetro: " + resultado2);
                break;

            case 3: 
                do{ 
                    System.out.println("Solo se aceptan numeros enteros positivos");
                    System.out.println("Ingresa el valor de la base");
                    base1 = entrada.nextDouble();
                }while (base1 <=0);
                do{ 
                    System.out.println("Solo se aceptan numeros enteros positivos");
                    System.out.println("Ingresa el valor de la altura");
                    base2 = entrada.nextDouble();
                }while (base2 <=0);
                resultado1 = (base1*base2)/2; 
                resultado2 = base1*3;
                System.out.println("El area del triangulo es: " + resultado1 + " y del perimetro es: " +resultado2);
                break;

            case 4:
                do{ 
                    System.out.println("Solo se aceptan numeros enteros positivos");
                    System.out.println("Ingresa el valor de un lado");
                    base1 = entrada.nextDouble();
                }while (base1 <=0);
                    resultado1 = base1*base1;
                    resultado2 = base1*4;
                    System.out.println("El area del cuadrado es: "+resultado1+"y del perimetro es: "+resultado2);
                    break;
    

            default:
            break;
        }

    }
    
    //tercera opcion
    public void Cc(){
        
        int credito = 100, lo, lc, li, llamada;
        double numc, lo1, li2, lc3, resultado1 ;

        JOptionPane.showMessageDialog(null, "Bienvenido a Batizphone!!! uwu/");
        JOptionPane.showMessageDialog(null, "Por unirte tienes un credito de 100$");
        JOptionPane.showMessageDialog(null, "Tu numero de celular es: 55844470");
        JOptionPane.showMessageDialog(null, "Las llamadas locales cuestan: 0.5$,Las llamadas Locales Internacionales cuestan: 0.6$,Las llamdas Celulares cuestan: 0.2$");
        JOptionPane.showMessageDialog(null, "Disfruta tu Plan ;D");

        System.out.println("Elija  la opcion deseada: ");
        System.out.println("1. Llamada Local");
        System.out.println("2. Llamada Internacional");
        System.out.println("3. Llamada Celular");
        System.out.println("4. Consultar saldo");
        llamada = entrada.nextInt();

        switch (llamada) {
            case 1:
                System.out.println("Su llamada esta siendo enlazada");
                break;
            case 2:
                System.out.println("Su llamada esta siendo enlazada");
                break;
            case 3:
                System.out.println("Su llamada esta siendo enlazada");
                break;

            case 4: 
                System.out.println("Ingrese su numero de telefono");
                numc = entrada.nextInt();

                if(numc == 55844470){
                    do{ 
                        System.out.println("Ingresa cuantas llamadas Locales realisaste");
                        lo = entrada.nextInt();
                    }while(lo < 0);
                    do{ 
                        System.out.println("Ingresa cuantas llamadas Internacionales realisaste");
                        li = entrada.nextInt();
                    }while(li < 0);
                    do{ 
                        System.out.println("Ingresa cuantas llamadas Celulares realisaste");
                        lc = entrada.nextInt();
                    }while(lc < 0);


                    lo1 = lo*0.5;
                    li2 = li*0.6; 
                    lc3 = lc*0.2;
                    resultado1 = lo1+li2+lc3;
                    credito -= resultado1;
                    System.out.println("Su credito es de: " +credito+"$.");
                    
                }else {
                    System.out.println("Lo sentimos este numero no tiene plan verifique si es el correcto ");
                }
                
            default:
                break;
        }
    }
}