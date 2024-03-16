import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JTextArea;

import Interface.JanelaPrincipalGUI;
import Manage.Aposta;

public class DellAcademy {

    private static ArrayList<Aposta> listaApostas;
    private static ArrayList<Aposta> listaVencedores;
    private static Aposta apostaPremiada;
    public static void main(String[] args) {
        new JanelaPrincipalGUI();
    }

        public static void apuracao(JTextArea jta) {
        for (Aposta aposta : listaApostas) {
            if(conferir(aposta.getVetor())) listaVencedores.add(aposta);
        }
        if(apostaPremiada.getContador()==30) {
            System.out.println("Ninguem ganhou!\n");
            return;
        }
        if(listaVencedores.isEmpty()) {
            System.out.println("Sorteando Novamente\n");
            apostaPremiada.gerarNovoNumeroSorteado();
            //jta.setText(getListaNumerosSorteados());
            apuracao(jta);
            return;
        }
        System.out.println("Tiveram ganhadores!\n");
        for (Aposta aposta : listaVencedores) {
            System.out.println("Aposta: " + aposta.printarAposta());
        }
    }

    private static boolean conferir(int[] array) {
        Set<Integer> numerosPremiados = new HashSet<>();
        for (int numero : apostaPremiada.getVetor()) {
            numerosPremiados.add(numero);
        }

        for (int numero : array) {
            if (!numerosPremiados.contains(numero)) {
                return false;
            }
        }

        return true;
    }


}
