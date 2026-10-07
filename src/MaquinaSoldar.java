public class MaquinaSoldar {

    private String marca;
    private String modelo;
    private int potencia;
    private String[] metales;

    public MaquinaSoldar(String marca, String modelo,
                         int potencia, String[] metales) {

        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = metales;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String[] getMetales() {
        return metales;
    }

    public void setMetales(String[] metales) {
        this.metales = metales;
    }

    public void soldar(String metal) {

        boolean puedeSoldar = false;

        for (int i = 0; i < metales.length; i++) {

            if (metales[i].equalsIgnoreCase(metal)) {
                puedeSoldar = true;
                break;
            }
        }

        if (puedeSoldar) {

            System.out.println(
                    "La máquina de soldar "
                            + marca + " "
                            + modelo
                            + " solda el "
                            + metal + "."
            );

        } else {

            System.out.println(
                    "La máquina de soldar "
                            + marca + " "
                            + modelo
                            + " no puede soldar "
                            + metal + "."
            );
        }
    }
}