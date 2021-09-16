package DicionariosExercicios;

import java.util.HashSet;
import java.util.Set;

public class ProvaEx3 {

      public void somaTotal(Set<Integer> conjuntoDeInteiros){
      Integer soma = 0;
      for(Integer valor: conjuntoDeInteiros){
      soma += valor;
      }
      System.out.println("Valor total da soma: " + soma);
      }

    public static void main(String[] args) {

        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(10);
        inteiros.add(14);
        inteiros.add(20);
        inteiros.add(28);

        ProvaEx3 prova = new ProvaEx3();
        prova.somaTotal(inteiros);

    }
}
