package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GuardaVolumeEx4 guardaVolumeEx4 = new GuardaVolumeEx4();

        List<PecaEx4> lista = new ArrayList<>();
        PecaEx4 peca1 = new PecaEx4();
        peca1.setMarca("Nike");
        peca1.setModelo("Camiseta");

        PecaEx4 peca2 = new PecaEx4();
        peca2.setMarca("Nike");
        peca2.setModelo("Bermuda");

        lista.add(peca1);
        lista.add(peca2);

        List<PecaEx4> lista2 = new ArrayList<>();
        PecaEx4 peca3 = new PecaEx4();
        peca3.setMarca("Nike");
        peca3.setModelo("Tênis");

        PecaEx4 peca04 = new PecaEx4();
        peca04.setMarca("Nike");
        peca04.setModelo("Vestido");

        lista.add(peca3);
        lista.add(peca04);

        System.out.println("Chave: " + guardaVolumeEx4.guardarPecas(lista));
        System.out.println("Chave: " + guardaVolumeEx4.guardarPecas(lista2));

        System.out.println("Qtd de peças armazenadas: " + guardaVolumeEx4.mostrarQtdPecas());

        guardaVolumeEx4.mostrarPecas();
        guardaVolumeEx4.mostrarPecas(1);
        guardaVolumeEx4.mostrarPecas(2);

        System.out.println("Removendo Peças ");
        guardaVolumeEx4.devolverPecas(1);
        guardaVolumeEx4.mostrarPecas();

        System.out.println("Qtd de peças armazenadas: " + guardaVolumeEx4.mostrarQtdPecas());
    }
}
