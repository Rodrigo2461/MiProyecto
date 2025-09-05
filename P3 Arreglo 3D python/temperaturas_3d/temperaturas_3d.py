# Programa: Análisis de Temperaturas con Matriz 3D
# Definir los nombres de las ciudades y días
ciudades = ["Quito", "Guayaquil", "Cuenca"]
dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]
semanas = ["Semana 1", "Semana 2", "Semana 3", "Semana 4"]

# Crear matriz 3D con datos de temperaturas (ciudad, semana, día)
# Dimensiones: [ciudades][semanas][días]
temperaturas = [
    # Quito (ciudad 0)
    [
        [15, 18, 20, 19, 17, 16, 14],  # Semana 1
        [16, 19, 21, 20, 18, 17, 15],  # Semana 2
        [14, 17, 19, 18, 16, 15, 13],  # Semana 3
        [17, 20, 22, 21, 19, 18, 16]   # Semana 4
    ],
    # Guayaquil (ciudad 1)
    [
        [28, 30, 32, 31, 29, 27, 26],  # Semana 1
        [29, 31, 33, 32, 30, 28, 27],  # Semana 2
        [27, 29, 31, 30, 28, 26, 25],  # Semana 3
        [30, 32, 34, 33, 31, 29, 28]   # Semana 4
    ],
    # Cuenca (ciudad 2)
    [
        [12, 15, 17, 16, 14, 13, 11],  # Semana 1
        [13, 16, 18, 17, 15, 14, 12],  # Semana 2
        [11, 14, 16, 15, 13, 12, 10],  # Semana 3
        [14, 17, 19, 18, 16, 15, 13]   # Semana 4
    ]
]

print("="*60)
print("ANÁLISIS DE TEMPERATURAS - MATRIZ 3D")
print("="*60)
print()

# Mostrar los datos originales
print(" DATOS DE TEMPERATURAS POR CIUDAD:")
print("-" * 40)
for i in range(len(ciudades)):
    print(f"\n  {ciudades[i]}:")
    for j in range(len(semanas)):
        print(f"  {semanas[j]}: {temperaturas[i][j]}")

print("\n" + "="*60)
print("    CÁLCULO DE PROMEDIOS POR SEMANA")
print("="*60)

# Bucles anidados para calcular promedios
for i in range(len(ciudades)):  # Bucle para ciudades
    print(f"\n  CIUDAD: {ciudades[i]}")
    print("-" * 30)
    
    for j in range(len(semanas)):  # Bucle para semanas
        suma_temperaturas = 0
        
        # Bucle para días de la semana
        for k in range(len(dias)):
            suma_temperaturas += temperaturas[i][j][k]
        
        # Calcular promedio
        promedio = suma_temperaturas / len(dias)
        
        # Mostrar resultado
        print(f"  {semanas[j]}: {promedio:.1f}°C")


print("\n ¡Análisis completado exitosamente!")
print("="*60)