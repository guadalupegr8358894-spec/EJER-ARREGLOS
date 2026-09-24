# Arreglos

¿En qué consiste el programa?

Este programa está realizado en Python y utiliza un arreglo bidimensional para almacenar las ventas de tres departamentos: Ropa, Deportes y Juguetería, durante los 12 meses del año.

El programa genera datos de ventas aleatorios y permite insertar, buscar y eliminar una venta específica.

Métodos utilizados
insertar_venta()

Sirve para agregar una venta en un mes y departamento específico. Recibe el índice del mes, el índice del departamento y el monto de la venta. Después guarda el monto en la matriz.

buscar_venta()

Sirve para buscar una venta específica. Recibe el mes y el departamento, obtiene el monto almacenado y lo muestra en pantalla.

eliminar_venta()

Sirve para eliminar una venta. Para hacerlo, cambia el valor de esa posición de la matriz a 0.

Funcionamiento del programa

Primero se crean los arreglos de meses y departamentos. Después se crea una matriz de 12 filas por 3 columnas, inicialmente llena de ceros.

Después se generan ventas aleatorias entre $1,000 y $5,000 y se almacenan en la matriz mediante el método insertar_venta().

Finalmente, el programa realiza una búsqueda de una venta y prueba la eliminación de otra venta.
