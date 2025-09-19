/*
 * Programa: Análisis de Temperaturas con Matriz 3D
 * Este programa analiza las temperaturas de diferentes ciudades durante varias semanas
 * utilizando una matriz tridimensional y funciones para calcular promedios.
 */

public class AnalisisTemperaturas {
    
    /**
     * Función para calcular la temperatura promedio de una ciudad en una semana específica
     * @param temperaturasSemana Array con las temperaturas de los 7 días de la semana
     * @return Temperatura promedio de la semana
     */
    public static double calcularPromedioSemana(int[] temperaturasSemana) {
        double suma = 0;
        
        // Sumar todas las temperaturas de la semana
        for (int i = 0; i < temperaturasSemana.length; i++) {
            suma += temperaturasSemana[i];
        }
        
        // Calcular y retornar el promedio
        return suma / temperaturasSemana.length;
    }
    
    /**
     * Función para calcular todas las temperaturas promedio de una ciudad
     * @param temperaturasCiudad Matriz con temperaturas de todas las semanas de una ciudad
     * @return Array con los promedios de cada semana
     */
    public static double[] calcularPromediosCiudad(int[][] temperaturasCiudad) {
        double[] promedios = new double[temperaturasCiudad.length];
        
        // Calcular promedio para cada semana
        for (int i = 0; i < temperaturasCiudad.length; i++) {
            promedios[i] = calcularPromedioSemana(temperaturasCiudad[i]);
        }
        
        return promedios;
    }
    
    /**
     * Función para mostrar los datos originales de temperaturas
     * @param ciudades Array con nombres de ciudades
     * @param semanas Array con nombres de semanas
     * @param temperaturas Matriz 3D con todas las temperaturas
     */
    public static void mostrarDatosOriginales(String[] ciudades, String[] semanas, int[][][] temperaturas) {
        System.out.println(" DATOS DE TEMPERATURAS POR CIUDAD:");
        System.out.println("-".repeat(40));
        
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("\n  " + ciudades[i] + ":");
            
            for (int j = 0; j < semanas.length; j++) {
                System.out.print("  " + semanas[j] + ": [");
                
                for (int k = 0; k < temperaturas[i][j].length; k++) {
                    System.out.print(temperaturas[i][j][k]);
                    if (k < temperaturas[i][j].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }
    
    /**
     * Función para mostrar los promedios calculados
     * @param ciudades Array con nombres de ciudades
     * @param semanas Array con nombres de semanas
     * @param temperaturas Matriz 3D con todas las temperaturas
     */
    public static void mostrarPromedios(String[] ciudades, String[] semanas, int[][][] temperaturas) {
      
        System.out.println("    CÁLCULO DE PROMEDIOS POR SEMANA");
        
        
        // Procesar cada ciudad
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("\n  CIUDAD: " + ciudades[i]);
            System.out.println("-".repeat(30));
            
            // Calcular promedios de todas las semanas de la ciudad
            double[] promediosCiudad = calcularPromediosCiudad(temperaturas[i]);
            
            // Mostrar los promedios
            for (int j = 0; j < semanas.length; j++) {
                System.out.printf("  %s: %.1f°C%n", semanas[j], promediosCiudad[j]);
            }
        }
    }
    
    /**
     * Método principal del programa
     */
    public static void main(String[] args) {
        // Definir los nombres de las ciudades, días y semanas
        String[] ciudades = {"Quito", "Guayaquil", "Cuenca"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] semanas = {"Semana 1", "Semana 2", "Semana 3", "Semana 4"};
        
        // Crear matriz 3D con datos de temperaturas [ciudad][semana][día]
        int[][][] temperaturas = {
            // Quito (ciudad 0)
            {
                {15, 18, 20, 19, 17, 16, 14},  // Semana 1
                {16, 19, 21, 20, 18, 17, 15},  // Semana 2
                {14, 17, 19, 18, 16, 15, 13},  // Semana 3
                {17, 20, 22, 21, 19, 18, 16}   // Semana 4
            },
            // Guayaquil (ciudad 1)
            {
                {28, 30, 32, 31, 29, 27, 26},  // Semana 1
                {29, 31, 33, 32, 30, 28, 27},  // Semana 2
                {27, 29, 31, 30, 28, 26, 25},  // Semana 3
                {30, 32, 34, 33, 31, 29, 28}   // Semana 4
            },
            // Cuenca (ciudad 2)
            {
                {12, 15, 17, 16, 14, 13, 11},  // Semana 1
                {13, 16, 18, 17, 15, 14, 12},  // Semana 2
                {11, 14, 16, 15, 13, 12, 10},  // Semana 3
                {14, 17, 19, 18, 16, 15, 13}   // Semana 4
            }
        };
        
        // Mostrar encabezado del programa
       
        System.out.println("ANÁLISIS DE TEMPERATURAS - MATRIZ 3D");
        
        System.out.println();
        
        // Mostrar datos originales
        mostrarDatosOriginales(ciudades, semanas, temperaturas);
        
        // Mostrar promedios calculados
        mostrarPromedios(ciudades, semanas, temperaturas);
        
        System.out.println("\n ¡Análisis completado exitosamente!");
    
 }
}