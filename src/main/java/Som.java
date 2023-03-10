//Nome: Pedro de Oliveira Machado -  RA: 2417855 - Engenharia da Computação
//JDK-19 - Netbeans 15

public abstract class Som{

    private float preco;
    private String marca, modelo;
	public int codigo, tipo;

	//Método Construtor
	public Som(){
		preco = 0;
		codigo = 0;
		tipo = 0;
		marca = " ";
		modelo = " ";
	}

	//Sobrecarga do método Som
	public Som(float preco,  int codigo, int tipo, String marca, String modelo){
		this.preco = preco;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.codigo = codigo;
	}

	public int getTipo(){
		return tipo;
	}
    public float getPreco(){
		return preco;
	}
	public int getCodigo(){
		return codigo;
	}
    public String getMarca(){
		return marca;
	}
    public String getModelo(){
		return modelo;
	}

	public void setTipo(int tipo) /*throws TipoExcecao*/{
		//if(tipo > 0 && tipo <= 3){
				
			this.tipo = tipo;
		//}
		//else{
			//throw new TipoExcecao();
		//}
	}
	public void setPreco(float preco){
		this.preco = preco;
	}
	public void setCodigo(int codigo) /*throws CodigoExcecao*/{
		//if(codigo > 0 && codigo <= 10000){
				
			this.codigo = codigo;
		//}
		//else{
			//throw new CodigoExcecao();
		//}
	}
    public void setMarca(String marca){
		this.marca = marca;
	}
    public void setModelo(String modelo){
		this.modelo = modelo;
	}
}