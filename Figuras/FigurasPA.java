import java.util.Scanner; 

class FigurasPA{
    
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double altura, base, radio;
        double a, b, resultado;
        
        do{ 
        System.out.println("Bienvenido, ¿En que te puedo ayudar?");
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("1. Calcular el area y perimetro de un cuadrado");
        System.out.println("2. Calcular el area y perimetro de un triangulo");
        System.out.println("3. Calcular el area y perimetro de un circulo");
        System.out.println("4. Calcular el area y perimetro de un rectangulo");
        System.out.println("5. Calcular el area y perimetro de un rombo");
        System.out.println("6. Calcular el area y perimetro de un hexagono");
        System.out.println("Para Salir presione S");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextDouble();
            }while (base <=0);
                resultado = base*base;
                System.out.println("El area del cuadrado es: "+resultado);
                resultado = base*4;
                System.out.println("El perimetro del cuadrado es: "+resultado);
                break;

            case 2:
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextDouble();
            }while (base <=0);
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextDouble();
            }while (altura <=0);
                resultado = (base*altura)/2; 
                System.out.println("El area del triangulo es: "+resultado);
                resultado = base*3;
                System.out.println("El perimetro del triangulo es: "+resultado);
                break;

            case 3:
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingresa el valor del radio");
                radio = entrada.nextDouble();
            }while (radio <=0);
                resultado = (radio*radio)*3.1416;
                System.out.println("El valor del area del circulo es: "+resultado);
                resultado = (radio*2)*3.1416;
                System.out.println("El valor del perimetro del circulo es: "+resultado);
                break;

            case 4: 
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de la base");
                base = entrada.nextDouble();
            }while (base <=0);
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de la altura");
                altura = entrada.nextDouble();
            }while (altura <=0);
                resultado = base*altura;
                System.out.println("El valor del area es: "+resultado);
                resultado = base*2+altura*2;
                System.out.println("El valor del perimetro es: "+resultado);
                break;

            case 5: 
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de un lado");
                base = entrada.nextDouble();
            }while (base <=0);
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de la diagonal 1");
                a = entrada.nextDouble();
            }while (a <=0);
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de la diagonale 2");
                b = entrada.nextDouble();
            }while (b <=0);
                resultado = base*4;
                System.out.println("El valor del perimetro del rombo es: "+resultado);
                resultado = (a*b)/2;
                System.out.println("El valor del area del rombo es: "+resultado);        
                break;                                                                                        
            
            case 6:
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de un lado");
                base = entrada.nextDouble();
            }while (base <=0);
            do{ 
                System.out.println("Solo se aceptan numeros enteros positivos");
                System.out.println("Ingrese el valor de la apotema");
                a = entrada.nextDouble();
            }while (a <=0);
                resultado = base*6;
                System.out.println("El valor del perimetro es: "+resultado);
                resultado = (base*6)*a;
                resultado = resultado/2;
                System.out.println("El valor del area es: "+resultado);
                break;

            default:
                System.out.println("Gracias por visitarnos :3");
                break;
                
        }

    }while (

}