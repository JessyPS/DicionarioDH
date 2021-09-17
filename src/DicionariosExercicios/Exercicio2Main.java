package DicionariosExercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2Main {

    public static void main(String[] args) {

//Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à lista vazia: 1,5,5,6,7,8,8,8.
//Imprimir o resultado na tela

        List<Integer> listaVazia = new ArrayList<>();

        listaVazia.add(1);
        listaVazia.add(5);
        listaVazia.add(5);
        listaVazia.add(6);
        listaVazia.add(7);
        listaVazia.add(8);
        listaVazia.add(8);
        listaVazia.add(8);

//        System.out.println(listaVazia);

//Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao conjunto vazio: 1,5,5,6,7,8,8,8.
//Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior?

//  Set é um conjunto, um conjunto não pode ter elementos duplicados, já em uma List pode!

        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

//        for(Integer valor : conjunto){
//            System.out.println(valor);
//        }


//Imprimir no Main todas as chaves junto com seus valores associados. Para isso, utilizar o
//foreach com as chaves ou o método toString().

        listaVazia.forEach((Integer) -> {
            System.out.println("Adicionando na lista: " + Integer);
        });
        System.out.println("-----------------------");
        conjunto.forEach((Integer) -> {
            System.out.println("Números do conjunto: " + Integer);
        });
    }
}
