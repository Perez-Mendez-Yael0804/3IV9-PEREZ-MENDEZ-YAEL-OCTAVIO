import java.util. Scanner;
class Examen3iv9yael{
    public static void main (String[] args){

    Scanner entrada = new Scanner(System.in);
    int respuesta;
    double vida,fuerza, defensa, ataque1, ataque2;
    float golpe, herida;
    char repetir;
    
        do{ 
            System.out.println("3IV9 Perez Mendez Yael Octavio");
            System.out.println();
            System.out.println("¡Bienvenido maestro pokemon!");
            System.out.println("Elije una de los pokemones que quieres consultar");
            System.out.println("1. Charmander");
            System.out.println("2. Bulbasaor");
            System.out.println("3. Squartle");
            System.out.println("4. ¡Batalla pokemon!");
            respuesta = entrada.nextInt();
                
                switch (respuesta) {
                    case 1:
                    System.out.println("¡Ha elejido a Charmander!");
                    System.out.println("El ID de este pokemon es: 2020");
                    System.out.println("Su fuerza es de 700");
                    System.out.println("Su defensa es de 600");
                    System.out.println("Su ataque principal es la Bomba Incendiaria y el dano es de 350HP");
                    System.out.println("Su ataque secundario es Lanza Llamas con un dano de 700HP");
                        System.out.println("Su vida es de 1000 puntos de salud");
                        break;
                    
                    case 2:
                        System.out.println("¡Ha elejido a Bulbasaor!");
                        System.out.println("El ID de este pokemon es: 2030");
                        System.out.println("Su fuerza es de 600");
                        System.out.println("Su defensa es de 800");
                        System.out.println("Su ataque principal es Lluvia Acida y el dano es de 300HP");
                        System.out.println("Su ataque secundario es Tsunami con un dano de 600HP");
                        System.out.println("Su vida es de 1000 puntos de salud");
                        break;
                    case 3:
                        System.out.println("¡Ha elejido a Squartle!");
                        System.out.println("El ID de este pokemon es: 2040");
                        System.out.println("Su fuerza es de 800");
                        System.out.println("Su defensa es de 400");
                        System.out.println("Su ataque principal es Tornado Venenoso y el dano es de 400HP");
                        System.out.println("Su ataque secundario es Viento Infernal con un dano de 800HP");
                        System.out.println("Su vida es de 1000 puntos de salud");
                        break;
                    case 4:
                        
                        System.out.println("¡Que empiece la batalla pokemon!");
                        System.out.println("Elija uno de los pokemones contra los que quiera luchar");
                        System.out.println("1. Charmander VS Bulbasaor");
                        System.out.println("2. Charmander VS Squartle");
                        System.out.println("3. Bulbasaor VS Charmander");
                        System.out.println("4. Bulbasaor VS Squartle");
                        System.out.println("5. Squartle VS Charmander");
                        System.out.println("6. Squartle VS Bulbasaor");
                        respuesta = entrada.nextInt();

                        switch (respuesta) {
                            case 1:
                                System.out.println("CHARMANDER VS BULBASAOR");                       
                                System.out.println("¡Ha elejido a Charmander!");
                                System.out.println("Su fuerza es de 700");
                                System.out.println("Su defensa es de 600");
                                System.out.println("Su ataque principal es la Bomba Incendiaria y el dano es de 350HP");
                                System.out.println("Su ataque secundario es Lanza Llamas con un dano de 700HP");
                                System.out.println("Su vida es de 1000 puntos de salud");

                                golpe = (700*600)/3;
                                herida = golpe;
                                break;
                            
                            case 2:
                                System.out.println("¡CHARMANDER VS SQUARTLE!");                       
                                System.out.println("¡Ha elejido a Charmander!");
                                System.out.println("Su fuerza es de 700");
                                System.out.println("Su defensa es de 600");
                                System.out.println("Su ataque principal es la Bomba Incendiaria y el dano es de 350HP");
                                System.out.println("Su ataque secundario es Lanza Llamas con un dano de 700HP");
                                System.out.println("Su vida es de 1000 puntos de salud");
                                break;

                            case 3:
                                System.out.println("¡BULBASAOR VS CHARMANDER!");
                                System.out.println("¡Ha elejido a Bulbasaor!");
                                System.out.println("Su fuerza es de 600");
                                System.out.println("Su defensa es de 800");
                                System.out.println("Su ataque principal es Lluvia Acida y el dano es de 300HP");
                                System.out.println("Su ataque secundario es Tsunami con un dano de 600HP");
                                System.out.println("Su vida es de 1000 puntos de salud");
                                break;

                            case 4:
                                System.out.println("¡BULBASAOR VS SQUARTLE!");
                                System.out.println("¡Ha elejido a Bulbasaor!");
                                System.out.println("Su fuerza es de 600");
                                System.out.println("Su defensa es de 800");
                                System.out.println("Su ataque principal es Lluvia Acida y el dano es de 300HP");
                                System.out.println("Su ataque secundario es Tsunami con un dano de 600HP");
                                System.out.println("Su vida es de 1000 puntos de salud");
                                break;
                            
                            case 5:
                                System.out.println("¡SQUARTLE VS CHARMANDER");
                                System.out.println("¡Ha elejido a Squartle!");
                                System.out.println("Su fuerza es de 800");
                                System.out.println("Su defensa es de 400");
                                System.out.println("Su ataque principal es Tornado Venenoso y el dano es de 400HP");
                                System.out.println("Su ataque secundario es Viento Infernal con un dano de 800HP");
                                System.out.println("Su vida es de 1000 puntos de salud");
                                break;

                            case 6:
                                System.out.println("¡SQUARTLE VS BULBASAOR");
                                System.out.println("¡Ha elejido a Squartle!");
                                System.out.println("Su fuerza es de 800");
                                System.out.println("Su defensa es de 400");
                                System.out.println("Su ataque principal es Tornado Venenoso y el dano es de 400HP");
                                System.out.println("Su ataque secundario es Viento Infernal con un dano de 800HP");
                                System.out.println("Su vida es de 1000 puntos de salud");
                                break;

                            default:
                                break;
                        }

                    default:
                        break;
                }

            System.out.println("Si desea repetir el menu presione r");
            repetir = entrada.next().charAt(0); 


        }while (repetir == 'r');
    }
}