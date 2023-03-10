//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

public class FoneOuvido extends Som{

    private String pMic; //p_mic = Presença de Microfone
	private String conexao; //Wireless os com fio
    private float comprimento;

	//Método Construtor
	public FoneOuvido(){
		pMic = "nao declarado";
		conexao = "nao declarado";
		comprimento = -1;
	}

	//Getters e Setters
    public String getPMic(){
		return pMic;
	}

	public String getConexao(){
		return conexao;
	}

	public float getComprimento(){ 
		return comprimento;
	}

	public void setPMic(String pMic){
		this.pMic = pMic;
	}

	public void setConexao(String conexao){
		this.conexao = conexao;
	}

	public void setComprimento(float comprimento){
		this.comprimento = comprimento;
	}
}