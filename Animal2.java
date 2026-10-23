package aula_08_10;

class Animal2 {
	String nome;
	String cor;
	String tamanho;
	String peso;
	String raca;
	
	private String getNome() {
		return nome;
	}
	protected void setNome(String nome){
		this.nome = nome;
	}
	private String getCor() {
		return cor;
	}
	protected void setCor(String cor){
		this.cor = cor;
	}
	private String getTamanho() {
		return tamanho;
	}
	protected void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}
	private String getPeso() {
		return peso;
	}
	protected void setPeso(String peso){
		this.peso = peso;
	}
	private String getRaca() {
		return raca;
	}
	protected void setRaca(String raca){
		this.raca = raca;
	}

}
