import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona(
                "Romario",
                "Salas Cerdas"
        );

        Persona persona2 = new Persona(
                "Alejandro",
                "Medrano Ruiz"
        );


        persona1.sacarPasaporte(
                "CR123456",
                "Costarricense",
                LocalDate.of(2024, 1, 10),
                LocalDate.of(2034, 1, 10),
                true
        );

        persona2.sacarPasaporte(
                "CR987654",
                "Costarricense",
                LocalDate.of(2015, 5, 20),
                LocalDate.of(2025, 5, 20),
                false
        );


        System.out.println("===== VUELOS =====");

        persona1.tomarVuelo("España");

        persona2.tomarVuelo("México");


        Mascota mascota = new Mascota(
                "Max",
                "Perro",
                4
        );


        persona1.adoptarMascota(mascota);

        persona2.adoptarMascota(mascota);


        System.out.println("\n===== MASCOTA =====");

        persona1.jugar();

        persona2.jugar();


        String[] metales = {
                "hierro",
                "acero",
                "aluminio"
        };


        MaquinaSoldar maquinaSoldar = new MaquinaSoldar(
                "Miller Electric",
                "ME123X",
                2500,
                metales
        );


        System.out.println("\n===== SOLDADURA =====");

        persona1.soldar(
                maquinaSoldar,
                "hierro"
        );

        persona1.soldar(
                maquinaSoldar,
                "titanio"
        );
    }
}