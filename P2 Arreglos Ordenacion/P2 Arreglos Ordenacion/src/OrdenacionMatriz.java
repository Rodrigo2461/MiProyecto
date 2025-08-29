import java.util.Scanner; // Importamos Scanner para leer entrada del usuario

public class OrdenacionMatriz {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear matriz 3x3
        int[][] matriz = new int[3][3];
        
        // Pedir al usuario que ingrese los elementos de la matriz
        System.out.println("=== PROGRAMA DE ORDENACION DE MATRIZ ===");
        System.out.println("Ingresa los 9 números para la matriz 3x3 (uno por uno):");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt(); // Guardar el número ingresado
            }
        }
        
        // Pedir la fila a ordenar
        System.out.print("\nIngresa el número de la fila a ordenar (0, 1 o 2): ");
        int filaAOrdenar = scanner.nextInt();
        
        // Validar que la fila ingresada sea válida
        if (filaAOrdenar < 0 || filaAOrdenar > 2) {
            System.out.println("¡Error! La fila debe ser 0, 1 o 2. Terminando programa.");
            scanner.close();
            return;
        }
        
        // Mostrar matriz original
        System.out.println("\nMatriz original:");
        mostrarMatriz(matriz);
        
        // Ordenar la fila
        System.out.println("\nOrdenando fila " + filaAOrdenar + " (orden ascendente)...");
        ordenarFila(matriz, filaAOrdenar);
        
        // Mostrar matriz después de ordenar
        System.out.println("\nMatriz después de ordenar:");
        mostrarMatriz(matriz);
        
        System.out.println("\n¡Proceso completado!");
        
        scanner.close(); // Cerrar el scanner
    }
    
    // Función para ordenar una fila específica usando Bubble Sort
    public static void ordenarFila(int[][] matriz, int fila) {
        int n = matriz[fila].length;
        
        // Bubble Sort para la fila específica
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriz[fila][j] > matriz[fila][j + 1]) {
                    // Intercambiar elementos
                    int temp = matriz[fila][j];
                    matriz[fila][j] = matriz[fila][j + 1];
                    matriz[fila][j + 1] = temp;
                }
            }
        }
    }
    
    // Función para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}