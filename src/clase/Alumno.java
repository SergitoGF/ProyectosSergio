package clase;

public class Alumno extends Personal {
    private String clase;

    public Alumno(String nombre, String dni, String clase) {
        super(nombre, dni);
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "clase='" + clase + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
