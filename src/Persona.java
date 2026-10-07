import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void sacarPasaporte(String numero,
                               String nacionalidad,
                               LocalDate fechaEmision,
                               LocalDate fechaVencimiento,
                               boolean estaVigente) {

        this.pasaporte = new Pasaporte(
                numero,
                nacionalidad,
                fechaEmision,
                fechaVencimiento,
                estaVigente
        );
    }

    public void tomarVuelo(String pais) {

        if (pasaporte != null && pasaporte.isEstaVigente()) {

            System.out.println(
                    nombre + " "
                            + apellidos
                            + " toma un vuelo a "
                            + pais + "."
            );

        } else {

            System.out.println(
                    nombre + " "
                            + apellidos
                            + " no puede tomar el vuelo, ya que su pasaporte no está vigente."
            );
        }
    }

    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugar() {

        if (mascota != null) {

            System.out.println(
                    nombre + " "
                            + apellidos
                            + " juega con "
                            + mascota.getNombre() + "."
            );

        } else {

            System.out.println(
                    nombre + " "
                            + apellidos
                            + " no tiene una mascota con quien jugar."
            );
        }
    }

    public void soldar(MaquinaSoldar maquinaSoldar, String metal) {
        maquinaSoldar.soldar(metal);
    }
}