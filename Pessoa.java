package semetre1
public Class Pessoa{
	int idade;
	String nome;
	String sexo;
	public String fala(){
		return nome;
	}

	public Pessoa(String nome, int idade, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
}
