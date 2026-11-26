import java.util.Random;

public abstract class DeporteDeAtletismo extends Deporte {

    protected double marca1;
    protected double marca2;
    protected Random random = new Random();

    public DeporteDeAtletismo(String nombre) {
        super(nombre);
    }

    protected void registrarMarca(int participante, double marca) {
        if (participante == 1) {
            marca1 = marca;
        } else if (participante == 2) {
            marca2 = marca;
        }
    }

    protected void mostrarMarcas(String pais1, String pais2, String unidad) {
        System.out.println("\nRESULTADO: " + pais1 + " " + marca1 + " " + unidad
                + " - " + marca2 + " " + unidad + " " + pais2);
    }

    // menorGana: poner true si gana la marca más baja (ej. tiempo en carreras)
    // o false si gana la marca más alta (ej. distancia en saltos o lanzamientos).
    protected void mostrarResultado(String pais1, String pais2, String unidad, boolean menorGana) {
        mostrarMarcas(pais1, pais2, unidad);

        if ((menorGana && marca1 < marca2) || (!menorGana && marca1 > marca2)) {
            System.out.println("Ganador: " + pais1);
        } else if ((menorGana && marca2 < marca1) || (!menorGana && marca2 > marca1)) {
            System.out.println("Ganador: " + pais2);
        } else {
            System.out.println("Empate entre " + pais1 + " y " + pais2);
        }
    }
}