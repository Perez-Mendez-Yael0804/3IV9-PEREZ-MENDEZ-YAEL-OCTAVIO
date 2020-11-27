import javax.swing.JOptionPane;

public class Bc{ 
    
    static char[][] tablero;
    static char[][] minas;
    static int[][] solucion;
    
    public void Inicio(){ 
        int respuesta = JOptionPane.showConfirmDialog(null, "Presiona en si para iniciar", "Buscaminas", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            iniciarTablero(5, 5, 5);
           
            generarSolucion();
            jugar(1);
           
        }else{
            JOptionPane.showMessageDialog(null, "Hasta la proxima :D");
        }
        
    }

    public static void mostrarTablero() {
           for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                  System.out.print(tablero[i][j] + "\t");
                }
               System.out.println("\n\n\n");
               
            }
     }

    public static void iniciarTablero(int filas, int columnas, int totalMinas) {
        tablero = new char[filas][columnas];
        minas = new char[filas][columnas];
        solucion = new int[filas][columnas];
            for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = '#';
            }
        }

        int contadorMinas = 0;

        while (contadorMinas < totalMinas) {
            int fi = (int) (Math.random() * filas);
            int co = (int) (Math.random() * columnas);
            if (minas[fi][co] == '\u0000') {
                minas[fi][co] = 'X';
                contadorMinas++;
            }
        }
    }

    public static void generarSolucion() {
        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas[0].length; j++) {
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if ((i + k >= 0) && (j + l >= 0) && (i + k < minas.length) && (j + l < minas[0].length)) {
                            if (minas[i][j] != 'X') {
                                if (minas[i + k][j + l] == 'X') {
                                     solucion[i][j]++;
                                }
                            } else {
                                solucion[i][j] = -1;
                            }
                        }
                    }
                }
                
            }
        }
    }

    
    public static void jugar(int cantidadMinas) {
        boolean completado = false;
        do {
            System.out.print("__________________________\n");
            JOptionPane.showMessageDialog(null, "Ingresa las coordenadas de la casilla que quieras abrir");
                
                String fl = JOptionPane.showInputDialog(null, "Ingresa la Fila: ");
                String cl = JOptionPane.showInputDialog(null, "Ingresa la Columna: ");
                int f = Integer.parseInt(fl);
                int c = Integer.parseInt(cl);
                if(c < 0 || f < 0 || c > 5 || f > 5){
                    JOptionPane.showMessageDialog(null, "Las coordenadas ingresadas son incorrectas vuelve a ingresarlas", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
               
            if (minas[f][c] == 'X') {
                JOptionPane.showMessageDialog(null, "Kaboom!! Has explotado ):", "Kaboom", JOptionPane.ERROR_MESSAGE);
                for (int i = 0; i < minas.length; i++) {
                    for (int j = 0; j < minas[0].length; j++) {
                        if (minas[i][j] == 'X') {
                            tablero[i][j] = 'X';
                        }
                    }
                }
                System.out.println("\3");
                mostrarTablero();
                break;
            } else {
                tablero[f][c] = (solucion[f][c] + "").charAt(0);
                mostrarTablero();
            }

            boolean victoria = verficarVictoria(cantidadMinas);

            if (victoria) {
                System.out.println("Ganaste!");
                for (int i = 0; i < minas.length; i++) {
                    for (int j = 0; j < minas[0].length; j++) {
                        if (minas[i][j] == 'X') {
                            tablero[i][j] = '*';
                        }
                    }
                }
                mostrarTablero();
                break;
            }
        } while (!completado);
    }

    public static boolean verficarVictoria(int cantidadMinas) {
        int posiblesMinas = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == '#') {
                    posiblesMinas++;
                }
            }
        }
        if (posiblesMinas == cantidadMinas) {
            return true;
        }
            return false;
    }
}
   