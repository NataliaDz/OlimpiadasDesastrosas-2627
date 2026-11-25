public abstract class Deporte {

    protected String nombre;

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public void presentarCompeticion(String pais1, String pais2) {
        System.out.println("\n========================================");
        System.out.println("DEPORTE: " + nombre);
        System.out.println(pais1 + " contra " + pais2);
        System.out.println("========================================");
    }

    protected void pausa() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public abstract void competir(String pais1, String pais2);
}
