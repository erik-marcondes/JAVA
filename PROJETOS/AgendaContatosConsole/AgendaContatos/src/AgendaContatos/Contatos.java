package AgendaContatos;

import java.io.*;
import java.util.ArrayList;

public class Contatos {
	private String id;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	ArrayList<String> lista = new ArrayList();
	
	public Contatos(){
	}
	public void inserir(String id, String nome, String endereco, String telefone, String email){
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		lista.add(this.id + ";" + this.nome + ";" + this.endereco + ";" + this.telefone + ";" + this.email);
	}
	public void mostrar(){
		int i;
	    int n = lista.size();
	    for (i=0; i<n; i++) {
	      System.out.printf("%d - %s\n", i, lista.get(i));
	    }
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	public void setEMail(String email){
		this.email = email;
	}
	public String getEMail(){
		return this.email;
	}
}
