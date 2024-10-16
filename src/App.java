import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de usuarios a ingresar: ");
        int tam = leer.nextInt();
        Persona[] personas = new Persona[tam];

        for (int i = 0; i < tam; i++) {
            leer.nextLine(); // Consumir salto de línea
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = leer.nextLine();
            
            int edad;
            do {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
                edad = leer.nextInt();
                if (edad < 0) {
                    System.out.println("Error: La edad no puede ser negativa. Intente nuevamente.");
                }
            } while (edad < 0);

            personas[i] = new Persona(nombre, edad);
        }

        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        mO.burbujaAvanzada(personas); 

        System.out.println("Edades Ordenadas:");
        for (Persona uPersona : personas) {
            System.out.print( " | " + uPersona.getEdad());
        }
        System.out.println();
        System.out.print("Ingrese la edad que desea buscar: ");
        int edadBuscada = leer.nextInt();

        MetodosBusqueda mB = new MetodosBusqueda();
        int resultado = mB.busquedaBinaria(personas, edadBuscada);

        if (resultado != -1) {
            System.out.println("La persona con  " + edadBuscada + " años de edad es " + personas[resultado].getNombre());
        } else {
            System.out.println("No se encontró una persona con la edad " + edadBuscada);
        }

        leer.close();
    }
}
