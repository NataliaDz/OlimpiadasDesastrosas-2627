import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("BIENVENIDOS A LAS OLIMPIADAS DESASTROSAS");

        String[] paises = {
            "España", "Francia", "Italia", "Alemania", "Portugal",
            "Japón", "China", "Brasil", "Argentina", "Canadá",
            "Australia", "México", "Estados Unidos", "Corea del Sur",
            "Grecia", "Noruega", "Suecia", "Kenia", "Egipto", "India"
        };

        Random random = new Random();
        ArrayList<Deporte> deportes = new ArrayList<>();
        deportes.add(new TiroConArco());
        deportes.add(new TiroAlPlato());

        // Cada nueva disciplina se añadira a esta lista.
        for (Deporte deporte : deportes) {
            int primero = random.nextInt(paises.length);
            int segundo;

            do {
                segundo = random.nextInt(paises.length);
            } while (primero == segundo);

            deporte.competir(paises[primero], paises[segundo]);
        }

        System.out.println("\nFIN DE LAS COMPETICIONES");
    }
}
