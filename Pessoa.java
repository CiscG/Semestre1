package semetre1
public Class Pessoa{
	int idade;
	String nome;
	String sexo;

	public Pessoa(String nome, int idade, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String falar(){
		return this.nome;
	}
}
