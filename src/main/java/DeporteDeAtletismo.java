import java.util.Random;

public abstract class DeporteDeAtletismo extends Deporte {

        double marca1;
        double marca2;

    public DeporteDeAtletismo(String nombre) {
        super(nombre);
    }

    protected double registrarMarca(String pais, double marca) {
        System.out.println("\nTurno de participante " + pais);

        Random random = new Random();
        marca = random.nextDouble(marca1, marca2);

        return marca;

    }

    protected void mostrarMarcas(String pais1, String pais2, String unidad) {

        System.out.println("\nRESULTADO: " + pais1 + " " + marca1
                + " - " + marca2 + " " + pais2);

        if (marca1 > marca2) {
            System.out.println("Ganador: " + pais1);
        } else if (marca2 > marca1) {
            System.out.println("Ganador: " + pais2);
        } else {
            System.out.println("Empate entre " + pais1 + " y " + pais2);
        }
    }

    }

    protected void mostrarResultado(String pais1, String pais2, String unidad, boolean menorGana) {





    }
}
