import java.util.Random;

public abstract class DeporteDePrecision extends Deporte {

    protected Random random = new Random();

    public DeporteDePrecision(String nombre) {
        super(nombre);
    }

    // Logica compartida: realizar intentos y sumar los puntos.
    protected int realizarIntentos(String pais, int cantidad, int maximoPorIntento) {
        int total = 0;
        System.out.println("\nTurno de " + pais + ":");

        for (int i = 1; i <= cantidad; i++) {
            int puntos = random.nextInt(maximoPorIntento + 1);
            total += puntos;
            System.out.println("  Intento " + i + ": " + describirIntento(puntos));
            pausa();
        }

        System.out.println("Total de " + pais + ": " + total + " puntos");
        return total;
    }

    // Cada disciplina explica sus resultados a su manera.
    protected abstract String describirIntento(int puntos);

    protected void anunciarResultado(String pais1, int puntos1, String pais2, int puntos2) {
        System.out.println("\nRESULTADO: " + pais1 + " " + puntos1
                + " - " + puntos2 + " " + pais2);

        if (puntos1 > puntos2) {
            System.out.println("Ganador: " + pais1);
        } else if (puntos2 > puntos1) {
            System.out.println("Ganador: " + pais2);
        } else {
            System.out.println("Empate entre " + pais1 + " y " + pais2);
        }
    }
}
