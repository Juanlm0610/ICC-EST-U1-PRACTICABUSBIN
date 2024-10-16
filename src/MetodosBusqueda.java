public class MetodosBusqueda {
    

    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        int cont = 0; // Inicializar el contador de iteraciones
        long starttime = System.nanoTime();
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                long endtime = System.nanoTime(); 
                System.out.println("Tiempo de Ejecución: " + (endtime - starttime) + " nanosegundos");
                // Elemento encontrado, mostrar el número de iteraciones
                System.out.println("Se realizaron " + cont + " iteraciones");
                return medio;
            }
            
            if (arr[medio] < value) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
            cont++; 
        }
        return -1;
    }
}
