//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDGerCaixa{
    
    private CaixaSom c;
    private List<CaixaSom> bdCaixa = new ArrayList<CaixaSom>();

    public List<CaixaSom> getBdCaixa(){
        return bdCaixa;
    }

    public CaixaSom cadCaixa(CaixaSom c){
        if(consCaixaCod(c) == null){
            bdCaixa.add(c);
            return c;
        }else{
            return null;
        }
    }

    public CaixaSom consCaixaCod(CaixaSom c){
        for (int i = 0; i < bdCaixa.size(); i++){
            if(c.getCodigo() == bdCaixa.get(i).getCodigo()){
                return bdCaixa.get(i);
            }
        }
        return null;
    }

    public CaixaSom deleteCaixaCod(CaixaSom c){
        c = consCaixaCod(c);
        if(c != null){
            bdCaixa.remove(c);
            return null;
        }else{
            return c;
        }
    }

    public CaixaSom updateCaixaCod(CaixaSom c){
        for(int i = 0; i <bdCaixa.size(); i++){
            if(c.getCodigo() == bdCaixa.get(i).getCodigo()){
                String marca = JOptionPane.showInputDialog(null, "Informe novamente a Marca da Caixa de Som:  ", "Atualiza Marca", 1);
                c.setMarca(marca);
                String modelo = JOptionPane.showInputDialog(null, "Informe novamente o Modelo da Caixa de Som:  ", "Atualiza Modelo", 1);
                c.setModelo(modelo);
                String preco = JOptionPane.showInputDialog(null, "Informe novamente ao Preco da Caixa de Som:  ", "Atualiza Preco", 1);
                c.setPreco(Float.parseFloat(preco));
                String peso = JOptionPane.showInputDialog(null, "Informe novamente o Peso da Caixa de Som:  ", "Atualiza Preco", 1);
                c.setPeso(Float.parseFloat(peso));
                String bateria = JOptionPane.showInputDialog(null, "Informe novamente a bateria em (h) da Caixa de Som:  ", "Atualiza Preco", 1);
                c.setBateria(Float.parseFloat(bateria));
                bdCaixa.set(i, c);
                String volume = JOptionPane.showInputDialog(null, "Informe novamente o Volume em (dB) da Caixa de Som:  ", "Atualiza Preco", 1);
                c.setVolume( Integer.parseInt(volume));
                return bdCaixa.get(i);
            }
        }
        return null;
    }
}