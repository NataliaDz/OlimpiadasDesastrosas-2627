public class TiroConArco extends DeporteDePrecision {

    public TiroConArco() {
        super("Tiro con arco");
    }

    @Override
    protected String describirIntento(int puntos) {
        return "Flecha lanzada: " + puntos + " puntos";
    }

    @Override
    public void competir(String pais1, String pais2) {
        presentarCompeticion(pais1, pais2);
        System.out.println("Cada pais lanza 3 flechas (0 a 10 puntos por flecha).");

        int puntos1 = realizarIntentos(pais1, 3, 10);
        int puntos2 = realizarIntentos(pais2, 3, 10);

        anunciarResultado(pais1, puntos1, pais2, puntos2);
    }
}
