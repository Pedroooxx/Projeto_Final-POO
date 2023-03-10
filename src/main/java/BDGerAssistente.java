//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDGerAssistente {
    
    private AssistenteSom a;
    private List<AssistenteSom> bdAssistente = new ArrayList<AssistenteSom>();

    public List<AssistenteSom> getBdAssistente(){
        return bdAssistente;
    }

    public AssistenteSom cadAssistente(AssistenteSom a){
        if(consAssistenteCod(a) == null){
            bdAssistente.add(a);
            return a;
        }else{
            return null;
        }
    }

    public AssistenteSom consAssistenteCod(AssistenteSom a){
        for (int i = 0; i < bdAssistente.size(); i++){
            if(a.getCodigo() == bdAssistente.get(i).getCodigo()){
                return bdAssistente.get(i);
            }
        }
        return null;
    }

    public AssistenteSom deleteAssistenteCod(AssistenteSom a){
        a = consAssistenteCod(a);
        if(a != null){
            bdAssistente.remove(a);
            return null;
        }else{
            return a;
        }
    }

    public AssistenteSom updateAssistenteCod(AssistenteSom a){
        for(int i = 0; i <bdAssistente.size(); i++){
            if(a.getCodigo() == bdAssistente.get(i).getCodigo()){
                String marca = JOptionPane.showInputDialog(null, "Informe novamente a Marca da Assistente Sonora:  ", "Atualiza Marca", 1);
                a.setMarca(marca);
                String modelo = JOptionPane.showInputDialog(null, "Informe novamente o Modelo da  Assistente Sonora:  ", "Atualiza Modelo", 1);
                a.setModelo(modelo);
                String preco = JOptionPane.showInputDialog(null, "Informe novamente ao Preco da Caixa de Som:  ", "Atualiza Preco", 1);
                a.setPreco(Float.parseFloat(preco));
                String sistemaop = JOptionPane.showInputDialog(null, "Informe novamente o Sistema Operacional da Assistente Sonora:  ", "Atualiza Marca", 1);
                a.setSistemaOP(sistemaop);
                String prelogio = JOptionPane.showInputDialog(null, "Informe novamente se a Assistente Sonora possui Relogio:  ", "Atualiza Marca", 1);
                a.setPRelogio(prelogio);
                String display = JOptionPane.showInputDialog(null, "Informe novamente o Display da Assistente Sonora:  ", "Atualiza Marca", 1);
                a.setDisplay(display);
                bdAssistente.set(i, a);
                return bdAssistente.get(i);
            }
        }
        return null;
    }
}