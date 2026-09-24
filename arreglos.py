import random

# Definición de meses y departamentos
MESES = [
    "Enero",
    "Febrero",
    "Marzo",
    "Abril",
    "Mayo",
    "Junio",
    "Julio",
    "Agosto",
    "Septiembre",
    "Octubre",
    "Noviembre",
    "Diciembre",
]
DEPARTAMENTOS = ["Ropa", "Deportes", "Juguetería"]

# Arreglo bidimensional (12 meses x 3 departamentos)
# Inicializado con 0
ventas = [[0 for _ in range(len(DEPARTAMENTOS))] for _ in range(len(MESES))]


# 1. Método para insertar elementos en el arreglo
def insertar_venta(mes_index, depto_index, monto):
    if 0 <= mes_index < len(MESES) and 0 <= depto_index < len(DEPARTAMENTOS):
        ventas[mes_index][depto_index] = monto
        print(
            f"Venta agregada: ${monto} en {DEPARTAMENTOS[depto_index]} ({MESES[mes_index]})"
        )
    else:
        print("Índices fuera de rango.")


# 2. Método para buscar un elemento en particular
def buscar_venta(mes_index, depto_index):
    if 0 <= mes_index < len(MESES) and 0 <= depto_index < len(DEPARTAMENTOS):
        monto = ventas[mes_index][depto_index]
        print(
            f"Venta en {MESES[mes_index]} - {DEPARTAMENTOS[depto_index]}: ${monto}"
        )
        return monto
    else:
        print("Índices fuera de rango.")
        return None


# 3. Método para eliminar una venta en particular de algún departamento (asigna 0)
def eliminar_venta(mes_index, depto_index):
    if 0 <= mes_index < len(MESES) and 0 <= depto_index < len(DEPARTAMENTOS):
        ventas[mes_index][depto_index] = 0
        print(
            f"Venta eliminada (establecida en $0) en {DEPARTAMENTOS[depto_index]} ({MESES[mes_index]})"
        )
    else:
        print("Índices fuera de rango.")


# --- Ejemplo de uso ---
# Llenar matriz con datos aleatorios de prueba
for m in range(12):
    for d in range(3):
        insertar_venta(m, d, random.randint(1000, 5000))

# Probar Búsqueda (ejemplo: Febrero [índice 1], Deportes [índice 1])
print("\n--- BÚSQUEDA ---")
buscar_venta(1, 1)

# Probar Eliminación (ejemplo: Enero [índice 0], Ropa [índice 0])
print("\n--- ELIMINACIÓN ---")
eliminar_venta(0, 0)
buscar_venta(0, 0)