public class TiroAlPlato extends DeporteDePrecision {

    public TiroAlPlato() {
        super("Tiro al plato");
    }

    @Override
    protected String describirIntento(int puntos) {
        if (puntos == 1) {
            return "Plato acertado (+1 punto)";
        }
        return "Plato fallado (0 puntos)";
    }

    @Override
    public void competir(String pais1, String pais2) {
        presentarCompeticion(pais1, pais2);
        System.out.println("Cada pais dispara a 5 platos (1 punto por acierto).");

        int puntos1 = realizarIntentos(pais1, 5, 1);
        int puntos2 = realizarIntentos(pais2, 5, 1);

        anunciarResultado(pais1, puntos1, pais2, puntos2);
    }
}
