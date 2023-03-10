//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

public class AssistenteSom extends Som{

    private String sistemaOP;
	private String pRelogio;
	private String display;


	//Método Construtor
	public AssistenteSom(){
		sistemaOP = " ";
		pRelogio = " ";
		display = " ";

	}
	
	//Getters e Setters
	public String getSistemaOP(){
		return sistemaOP;
	}
	public String getPRelogio(){
		return pRelogio;
	}
	public String getDisplay(){
		return display;
	}

	public void setSistemaOP(String sistemaOP){
		this.sistemaOP = sistemaOP;
	}

	public void setPRelogio(String pRelogio){
		this.pRelogio = pRelogio;
	}
	public void setDisplay(String display){
		this.display = display;
	}
}