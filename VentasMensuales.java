import java.util.Random;

public class VentasMensuales {

    // Nombres de filas y columnas para referencia
    private static final String[] MESES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    private static final String[] DEPARTAMENTOS = {"Ropa", "Deportes", "Juguetería"};

    // Matriz bidimensional de 12 meses por 3 departamentos
    private static double[][] ventas = new double[12][3];

    // 1. Método para insertar elementos en el arreglo
    public static void insertarVenta(int mesIndex, int deptoIndex, double monto) {
        if (mesIndex >= 0 && mesIndex < 12 && deptoIndex >= 0 && deptoIndex < 3) {
            ventas[mesIndex][deptoIndex] = monto;
            System.out.println("Venta agregada: $" + monto + " en " + DEPARTAMENTOS[deptoIndex] + " (" + MESES[mesIndex] + ")");
        } else {
            System.out.println("Índices fuera de rango.");
        }
    }

    // 2. Método para buscar un elemento en particular
    public static double buscarVenta(int mesIndex, int deptoIndex) {
        if (mesIndex >= 0 && mesIndex < 12 && deptoIndex >= 0 && deptoIndex < 3) {
            double monto = ventas[mesIndex][deptoIndex];
            System.out.println("Venta en " + MESES[mesIndex] + " - " + DEPARTAMENTOS[deptoIndex] + ": $" + monto);
            return monto;
        } else {
            System.out.println("Índices fuera de rango.");
            return -1;
        }
    }

    // 3. Método para eliminar una venta en particular de algún departamento
    public static void eliminarVenta(int mesIndex, int deptoIndex) {
        if (mesIndex >= 0 && mesIndex < 12 && deptoIndex >= 0 && deptoIndex < 3) {
            ventas[mesIndex][deptoIndex] = 0.0;
            System.out.println("Venta eliminada (establecida en $0.0) en " + DEPARTAMENTOS[deptoIndex] + " (" + MESES[mesIndex] + ")");
        } else {
            System.out.println("Índices fuera de rango.");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // Llenar matriz con ventas de prueba
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                insertarVenta(i, j, 1000 + rand.nextInt(4000));
            }
        }

        // Probar Búsqueda (ej. Febrero [1], Deportes [1])
        System.out.println("\n--- BÚSQUEDA ---");
        buscarVenta(1, 1);

        // Probar Eliminación (ej. Enero [0], Ropa [0])
        System.out.println("\n--- ELIMINACIÓN ---");
        eliminarVenta(0, 0);
        buscarVenta(0, 0);
    }
}