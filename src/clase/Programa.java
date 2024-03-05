package clase;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Personal> listaPersonal = new ArrayList<>();

        listaPersonal.add(new Alumno("Sergio","52900571L","DAW"));
        listaPersonal.add(new Profesor("Diego","54700987P","Programador"));
    }
}
