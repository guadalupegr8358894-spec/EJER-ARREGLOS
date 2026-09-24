# Arreglos de ventas

## ¿En qué consiste el programa?

Este programa utiliza un arreglo bidimensional (matriz) para guardar las ventas de tres departamentos: Ropa, Deportes y Juguetería, durante los 12 meses del año.

Cada fila representa un mes y cada columna representa un departamento. El programa genera cantidades de ventas aleatorias entre $1,000 y $5,000 para llenar la matriz.

Además, cuenta con métodos para insertar, buscar y eliminar ventas.

## ¿Cómo funciona cada método?

### 1. insertar_venta()

Este método sirve para agregar una venta en un mes y departamento específico.

Recibe tres datos:

- `mes_index`: indica el mes.
- `depto_index`: indica el departamento.
- `monto`: cantidad de la venta.

Primero verifica que los índices sean correctos y después guarda el monto en la matriz.

### 2. buscar_venta()

Este método sirve para consultar una venta específica.

Recibe el número del mes y el departamento, busca la cantidad almacenada y la muestra en pantalla. También devuelve el monto encontrado.

Si los índices no son correctos, muestra un mensaje indicando que están fuera de rango.

### 3. eliminar_venta()

Este método sirve para eliminar una venta específica.

En lugar de borrar físicamente el espacio de la matriz, cambia el valor de esa venta a 0, indicando que ya no existe una venta registrada en esa posición.

## Funcionamiento general

Primero se crean los arreglos con los meses y departamentos. Después se crea una matriz de 12 × 3, inicialmente llena de ceros.

Posteriormente, el programa utiliza `random.randint()` para generar ventas aleatorias y las almacena mediante `insertar_venta()`.

Finalmente, se prueba la búsqueda de una venta de febrero en Deportes y se elimina una venta de enero en Ropa, comprobando después que su valor quedó en $0.

## Lenguajes

El programa se realiza en:

- Python
- Java
