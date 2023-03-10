//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDGerFone {
    
    private FoneOuvido f;
    private List<FoneOuvido> bdFone = new ArrayList<FoneOuvido>();

    public List<FoneOuvido> getBdFone(){
        return bdFone;
    }

    public FoneOuvido cadFone(FoneOuvido f){
        if(consFoneCod(f) == null){
            bdFone.add(f);
            return f;
        }else{
            return null;
        }
    }

    public FoneOuvido consFoneCod(FoneOuvido f){
        for (int i = 0; i < bdFone.size(); i++){
            if(f.getCodigo() == bdFone.get(i).getCodigo()){
                return bdFone.get(i);
            }
        }
        return null;
    }

    public FoneOuvido deleteFoneCod(FoneOuvido f){
        f = consFoneCod(f);
        if(f != null){
            bdFone.remove(f);
            return null;
        }else{
            return f;
        }
    }

    public FoneOuvido updateFoneCod(FoneOuvido f){
        for(int i = 0; i <bdFone.size(); i++){
            if(f.getCodigo() == bdFone.get(i).getCodigo()){
                String marca = JOptionPane.showInputDialog(null, "Informe novamente a Marca do Fone de Ouvido:  ", "Atualiza Marca", 1);
                f.setMarca(marca);
                String modelo = JOptionPane.showInputDialog(null, "Informe novamente o Modelo do Fone de Ouvido:  ", "Atualiza Modelo", 1);
                f.setModelo(modelo);
                String preco = JOptionPane.showInputDialog(null, "Informe novamente ao Preco do Fone de Ouvido:  ", "Atualiza Preco", 1);
                f.setPreco(Float.parseFloat(preco));
                String pmic = JOptionPane.showInputDialog(null, "Informe novamente se o Fone de Ouvido possui Microfone:  ", "Atualiza Marca", 1);
                f.setPMic(pmic);
                String conexao = JOptionPane.showInputDialog(null, "Informe novamente o tipo de conexão do Fone de Ouvido:  ", "Atualiza Marca", 1);
                f.setConexao(conexao);
                String comprimento = JOptionPane.showInputDialog(null, "Informe novamente o comprimento do Fone de Ouvido:  ", "Atualiza Preco", 1);
                f.setComprimento(Float.parseFloat(comprimento));
                bdFone.set(i, f);
                return bdFone.get(i);
            }
        }
        return null;
    }
}