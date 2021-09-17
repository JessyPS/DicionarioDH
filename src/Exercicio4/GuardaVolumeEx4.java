package Exercicio4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumeEx4 {

    private Map<Integer, List<PecaEx4>> marcaEModelo = new HashMap<>();
    private Integer identificadorA = 1;

    public Integer guardarPecas(List<PecaEx4> listaDePecas){
        marcaEModelo.put(identificadorA , listaDePecas);
        identificadorA += 1;
        return identificadorA -1;
    }

    public void mostrarPecas(){
        for (Integer chave : marcaEModelo.keySet()){
            mostrarPecas(chave);
        }
    }

    public void mostrarPecas (Integer chave) {
        List<PecaEx4> pecas = marcaEModelo.get(chave);
        System.out.println("Número da chave: " + chave);
//        pecas.stream().forEach(System.out::println);
        for (PecaEx4 peca : pecas) {
            System.out.println("Marca: " + peca.getMarca());
            System.out.println("Modelo: " + peca.getModelo());
            System.out.println(peca);
        }
    }

//        pecas.stream().forEach(peca -> System.out.println(peca))
//        OU OU OU
//        for (PecaEx4 peca : pecas) {
//            System.out.println(peca);
//        }

    public void devolverPecas(Integer chave){
        marcaEModelo.remove(chave);
    }

    public Integer mostrarQtdPecas() {
        Integer totalPecas = 0;
        for (Integer chave : marcaEModelo.keySet()){
            List<PecaEx4> lista = marcaEModelo.get(chave);
            totalPecas += lista.size();
        }

//    marcaEModelo.keySet().stream().reduce(chave -> {}

        return totalPecas;
    }

    public Integer getIdentificadorA() {
        return identificadorA;
    }

    public void setIdentificadorA(Integer identificadorA) {
        this.identificadorA = identificadorA;
    }
}



//            List<PecaEx4> pecas = marcaEModelo.get(chave);
//            System.out.println("Chave: " + chave);
//            for(PecaEx4 peca : pecas) {
//                System.out.println(peca);
//       OU
//                System.out.println("Marca: " + peca.getMarca());
//                System.out.println("Modelo: " + peca.getModelo());}