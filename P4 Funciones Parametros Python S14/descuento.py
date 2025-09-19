# Función para calcular el descuento
def calcular_descuento(monto_total, porcentaje_descuento=10):
    """
    Calcula el monto del descuento basado en el monto total y porcentaje.
    
    Parámetros:
    - monto_total: el monto total de la compra
    - porcentaje_descuento: porcentaje de descuento (por defecto 10%)
    
    Retorna:
    - el monto del descuento calculado
    """
    descuento = monto_total * (porcentaje_descuento / 100)
    return descuento

# Programa principal
print("=== CALCULADORA DE DESCUENTOS ===\n")

# Primera llamada: solo con monto total (usa descuento por defecto del 10%)
monto1 = 450.00
descuento1 = calcular_descuento(monto1)
monto_final1 = monto1 - descuento1

print("Primera compra:")
print(f"Monto total: ${monto1}")
print(f"Descuento aplicado: {10}%")
print(f"Monto del descuento: ${descuento1}")
print(f"Monto final a pagar: ${monto_final1}")
print()

# Segunda llamada: con monto total y porcentaje de descuento específico
monto2 = 250.00
porcentaje2 = 15
descuento2 = calcular_descuento(monto2, porcentaje2)
monto_final2 = monto2 - descuento2

print("Segunda compra:")
print(f"Monto total: ${monto2}")
print(f"Descuento aplicado: {porcentaje2}%")
print(f"Monto del descuento: ${descuento2}")
print(f"Monto final a pagar: ${monto_final2}")