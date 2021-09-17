package DicionariosExercicios;

import java.util.HashMap;
import java.util.Map;

public class LoteriaDosSonhosEx1 {

    public static void main(String[] args) {

        Map <Integer, String> listaLoteria = new HashMap<>();

        listaLoteria.put(0, "Ovos");
        listaLoteria.put(1, "Água");
        listaLoteria.put(2, "Escopeta");
        listaLoteria.put(3, "Cavalo");
        listaLoteria.put(4, "Dentista");
        listaLoteria.put(5, "Fogo");

        Map <String, String[]> listaStrings = new HashMap<>();
        String [] amigosJoao = {"Juan", "Fissura", "Maromba"};
        String [] amigosMiguel = {"Night Watch", "Bruce Wayne", "Tampinha"};
        String [] amigosMaria = {"Wonder Woman", "Mary", "Marilene"};
        String [] amigosLucas = {"Lukinha", "Jorge", "George"};

        listaStrings.put("João", amigosJoao);
        listaStrings.put("Miguel", amigosMiguel);
        listaStrings.put("Maria", amigosMaria);
        listaStrings.put("Lucas", amigosLucas);

        listaLoteria.forEach((Integer, String) -> System.out.println("Chave: " + Integer + " Valor: " + String ));
        System.out.println("");

//        listaStrings.forEach((Chave, Valor) -> System.out.println("Chave: " + Chave + " Valor: " + Valor));

        for(String chave : listaStrings.keySet()){
            String [] valorChave = listaStrings.get(chave);
            System.out.print(chave + ": ");
            for(String valorString : valorChave) {
                System.out.print(valorString + ", ");
            }
            System.out.println("");
        }

    }
}
