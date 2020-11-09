import java.util.Scanner;

public class Anid{

    Scanner entrada = new Scanner(System.in);

    public void menu(){

        int opcion;

        System.out.println("Bienvenido a nuestro programa, ¿En que te puedo ayudar?");
        System.out.println("Elije una de las opciones siguientes: ");
        System.out.println("1. Promedio de numeros");
        System.out.println("2. Posiciones pares");
        System.out.println("3. Calificaciones");
        System.out.println("4. Suma de matrices");
        System.out.println("5. Salir");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                Promedio();
                break;

            case 2:
                po();
                break;
            
            case 3:
                Calificaciones();
                break;

            case 4:
                Matrices();
                break;
        
            default:
                System.out.println("Gracias por visitarnos :3");
                break;
        }
    }

    public void Promedio(){
        
        double arreglo[] = new double[10]; 
        double resul1 = 0, resul2 = 0;
        double promedio1 = 0, promedio2 = 0, num1;
    
        for(int i = 0; i<arreglo.length; i++){
             System.out.println("Ingresa 10 numeros pueden ser positivos o negativos");
                num1 = entrada.nextInt(); 
                arreglo[i] = num1;
                
            if(num1 < 0){   
                    resul1 = resul1 + num1;
                    promedio1 = promedio1 + 1;
            }else if(num1 > 0){ 
                    resul2 = resul2 + num1;
                    promedio2 = promedio2 + 1;
            }
        }
        resul1 = resul1/promedio1;
        resul2 = resul2/promedio2;
        System.out.println("El promedio de los numeros negativos es :"+resul1+"y el de los numeros positivos es: "+resul2);
    
    }

    public void po(){

      double arreglo[] = new double [10];
      double resul1 = 0;

        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Introduce 10 numeros positivos o negativos");
            arreglo[i]= entrada.nextInt();  
        }
        resul1=(arreglo[0] + arreglo[2] + arreglo[4] + arreglo[6] + arreglo[8])/5;
        System.out.println("El promedio de los numeros en la posicion par es: "+resul1);


    }

    public void Calificaciones(){

        double arreglo[] = new double[10];
        double num1 = 0, promedio1 = 0,promedio2 = 0, resul1 = 0, num = 0, promedio3 = 0, num3 = 0;

        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Ingrese las 10 calificaiones");
                num1 = entrada.nextDouble();
                arreglo[i] = num1;
            while(num1 <=0 || num1 >10){
                System.out.println("Ingrese las 10 calificaiones");
                num1 = entrada.nextDouble();
                arreglo[i] = num1;
            }
        }
            
        for(int j = 0; j<arreglo.length; j++){
         System.out.println("La calificacion es: " +arreglo[j]);
        }
        for(int k = 0; k<arreglo.length; k++){
            resul1 += arreglo[k];
            promedio1 += 1;
        }
        resul1 /= promedio1;
        System.out.println("El promedio total de las calificaiones es: "+resul1);
            
        for( int k = 0; k<arreglo.length; k++){
            num1 = arreglo[0];
            num = arreglo[0];
            if(num1 < arreglo[k]){
                num1 = arreglo[k];
            } 
            if(num > arreglo[k]){
                num = arreglo[k];
            }
        }
        System.out.println("El numero mas grande es: "+num1+" y el mas pequeño es: "+num);
        for( int i = 0; i<arreglo.length; i++){
            if(arreglo[i] >= 6){
                promedio3 += 1;
            }else if(arreglo[i] <=5){
                promedio2 +=1;
            }
        }
        System.out.println("El numero de alumnos aprobados es: "+promedio3+"y el de reprobados es: "+promedio2);

        for( int k = 0; k<arreglo.length; k++){
            num3 = arreglo[0];
            if (num3 > resul1){
                promedio3 += 1;
            }
        }
            System.out.println("El numero de calificaciones superiores al promedio es: "+promedio3);
    }   

    public void Matrices(){
        int matriza[][] = new int [3][3]; 
        int matrizb[][] = new int [3][3]; 
        int matrizs[][] = new int [3][3]; 

        for(int i = 0; i<matriza.length; i++){
            for(int j = 0; j<matriza.length; j++){
                System.out.println("Ingresa el valor de la fila: "
                + i + " y la columna : "+ j + " ");
                matriza[i][j]=entrada.nextInt();
            }
        }

        for(int i = 0; i<matrizb.length; i++){
            for(int j = 0; j<matrizb.length; j++){
                System.out.println("Ingresa el valor de la fila: "
                + i + " y la columna : "+ j + " ");
                matrizb[i][j]=entrada.nextInt();
            }
        }

        for(int i = 0; i<matriza.length; i++){
            for(int j = 0; j<matrizb.length; j++){
                matrizs[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }
        for( int i = 0; i<matrizs.length; i++){
            for(int j = 0; j<matrizs.length; j++){
                System.out.println("La suma de las matrices a y b es: "+matrizs[i][j]);
            }
           
        }

        

    }   
}
