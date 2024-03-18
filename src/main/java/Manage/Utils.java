/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author nico
 */
public class Utils {
    
    
    //USO PARA CENTRALIZAR ITENS TABELA
    public static void centralizarConteudoTabela(JTable jTable) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        TableColumnModel columnModel = jTable.getColumnModel();
        int columns = columnModel.getColumnCount();
        
        for (int i = 0; i < columns; i++) {
            columnModel.getColumn(i).setCellRenderer(renderer);
        }
    }
    
    public static void preencherTabelaVencedores(JTable jtable, ArrayList<Aposta> listaVencedores) {
        if(listaVencedores.isEmpty()) return;
        listaVencedores.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        for (Aposta aposta : listaVencedores) {
            model.addRow(new Object[]{aposta.getNome(), "R$" + ((int)100_000_000/listaVencedores.size() + ",00")});
        }
    }

    public static void preencherNumerosOrdenadosPorFrequencia(JTable jtable, ArrayList<int[]> lista) {
        HashMap<Integer, Integer> mapaOrdenado = ordenarPorFrequencia(obterMapaFrequencia(lista));

        DefaultTableModel tableModel = (DefaultTableModel) jtable.getModel();
        tableModel.setColumnIdentifiers(new String[]{"Número", "Frequência"});
        
        for (Map.Entry<Integer, Integer> entry : mapaOrdenado.entrySet()) {
            tableModel.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
    }

    private static HashMap<Integer, Integer> obterMapaFrequencia(ArrayList<int[]> listaArrays) {
        HashMap<Integer, Integer> mapaFrequencia = new HashMap<>();
        for (int[] array : listaArrays) {
            for (int num : array) {
                mapaFrequencia.put(num, mapaFrequencia.getOrDefault(num, 0) + 1);
            }
        }
        return mapaFrequencia;
    }

    private static HashMap<Integer, Integer> ordenarPorFrequencia(HashMap<Integer, Integer> mapa) {
        return mapa.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    
}
