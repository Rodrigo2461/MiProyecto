# 1. CREAR UN DICCIONARIO
# Creamos un diccionario con información de una persona ficticia
informacion_personal = {
    "nombre": "Luna Morales",
    "edad": 28,
    "ciudad": "Quito",
    "profesion": "Diseñadora Gráfica"
}

print("Diccionario inicial:")
print(informacion_personal)
print()

# 2. ACCEDER Y MODIFICAR VALORES
# Accedemos a la ciudad y la cambiamos
print("Ciudad actual:", informacion_personal["ciudad"])
informacion_personal["ciudad"] = "Cuenca"
print("Ciudad modificada:", informacion_personal["ciudad"])
print()

# 3. VERIFICAR EXISTENCIA DE CLAVES
# Verificamos si existe la clave "telefono"
if "telefono" not in informacion_personal:
    print("La clave 'telefono' no existe, la agregamos...")
    informacion_personal["telefono"] = "0998765432"
else:
    print("La clave 'telefono' ya existe")
print()

# 4. ELIMINAR UNA CLAVE
# Eliminamos la clave "edad"
del informacion_personal["edad"]
print("Clave 'edad' eliminada")
print()

# 5. IMPRIMIR EL DICCIONARIO FINAL
print("=" * 40)
print("DICCIONARIO FINAL:")
print("=" * 40)
for clave, valor in informacion_personal.items():
    print(f"{clave}: {valor}")