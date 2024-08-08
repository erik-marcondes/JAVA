public class Cliente{
	
	//Atributos.
	private String cpf;
	private String nome;
	private String profissao;
	
	//Métodos.
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	public String getCPF(){
		return this.cpf;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setProfissao(String profissao){
		this.profissao = profissao;
	}
	public String getProfissao(){
		return this.profissao;
	}
}