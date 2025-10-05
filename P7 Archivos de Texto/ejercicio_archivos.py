# Trabajo con Archivos de Texto

# 1. ESCRITURA DE ARCHIVO DE TEXTO
# Crear y abrir el archivo mis_notas.txt en modo escritura
archivo = open('mis_notas.txt', 'w')

# Escribir tres líneas de notas personales
archivo.write('Esta es mi primera nota personal.\n')
archivo.write('Estoy aprendiendo a trabajar con archivos en Python.\n')
archivo.write('Es muy importante cerrar los archivos después de usarlos.\n')

# Cerrar el archivo después de escribir
archivo.close()

print("Archivo creado y notas escritas correctamente.\n")

# 2. LECTURA DE ARCHIVO DE TEXTO
# Abrir el archivo mis_notas.txt en modo lectura
archivo = open('mis_notas.txt', 'r')

print("Contenido del archivo mis_notas.txt:")
print("=" * 50)

# Leer el archivo línea por línea
for linea in archivo:
    # Mostrar cada línea en la consola
    print(linea.strip())  # strip() elimina el salto de línea extra

# 3. CIERRE DE ARCHIVOS
# Cerrar el archivo después de leer
archivo.close()

print("=" * 50)
print("\nArchivo cerrado correctamente.")