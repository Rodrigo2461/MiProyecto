public class BusquedaMatriz {
    
    public static void main(String[] args) {
        // Crear matriz 3x3 con valores
        int[][] matriz = {
            {10, 25, 8},
            {15, 30, 12},
            {20, 5, 18}
        };
        
        System.out.println("=== PROGRAMA DE BUSQUEDA EN MATRIZ ===\n");
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        // Probar con un valor que SÍ existe
        int valorBuscado1 = 30;
        System.out.println("\n--- Búsqueda 1 ---");
        System.out.println("Buscando el valor: " + valorBuscado1);
        buscarValor(matriz, valorBuscado1);
        
        // Probar con un valor que NO existe
        int valorBuscado2 = 99;
        System.out.println("\n--- Búsqueda 2 ---");
        System.out.println("Buscando el valor: " + valorBuscado2);
        buscarValor(matriz, valorBuscado2);
    }
    
    // Función para buscar un valor en la matriz
    public static void buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("¡Valor encontrado!");
                    System.out.println("Posición: Fila " + i + ", Columna " + j);
                    return; // Sale de la función cuando encuentra el valor
                }
            }
        }
        System.out.println("Valor no encontrado en la matriz.");
    }
    
    // Función para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}