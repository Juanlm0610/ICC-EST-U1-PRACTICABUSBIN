public class MetodosBusqueda {
    public int busquedaBinaria(Persona[] personas, int edadBuscada) {
        int bajo = 0;
        int alto = personas.length - 1;
        
        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();
            System.out.println("bajo=" + bajo + " alto=" + alto + " centro=" + centro + " valorCentro=" + valorCentro);
            
            if (valorCentro == edadBuscada) {
                System.out.println("LA EDAD SE HA ENCONTRADO");
                return centro;
            } else if (valorCentro < edadBuscada) {
                System.out.println("EL ARREGLO SEGUIRA HACIA LA DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("EL ARREGLO SEGUIRA HACIA LA IZQUIERDA");
                alto = centro - 1;
            }
        }
        return -1; 
    }
}
