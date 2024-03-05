package clase;

public class Profesor extends Personal{
    private String especialidad;

    public Profesor(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
    }
}
