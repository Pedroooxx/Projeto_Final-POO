//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

public class CaixaSom extends Som{

    private float peso;
	private float bateria; // Longevidade da Bateria (h hora)
    private int volume; // Intensidade do Som (Db Decibels) ou simplesmente volume

	//Método Construtor
	public CaixaSom(){
		peso = 0;
		volume = -1;
		bateria = 0;
	}
	
	//Getters e Setters
    public float getPeso(){
		return peso;
	}

	public int getVolume(){
		return volume;
	}

	public float getBateria(){
		return bateria;
	}

	public void setPeso(float peso){
		this.peso = peso;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}

	public void setBateria(float bateria){
		this.bateria = bateria;
	}

}