public class MetodoOrdenamiento {
    public void burbujaAvanzada(Persona[] personas) {
        int tam = personas.length;
        boolean intercambio;
        for (int i = 0; i < tam - 1; i++) {
            intercambio = false;
            for (int j = 0; j < tam - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio)
                break; 
        }
    }
}
