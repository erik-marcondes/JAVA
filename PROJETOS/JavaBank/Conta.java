public class Conta{
	
	//Atributos.
	private Cliente titular;
	private int numero;
	private int agencia;
	private double saldo;

	//Médotos.
	public void deposita(double valor){
		this.saldo += valor;
	}
	public boolean saca(double valor){
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saque negado. Saldo insuficiente!");
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino){
		if (this.saldo >= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Transferencia negada. Saldo insuficiente!");
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void setTitular(Cliente titular){
		this.titular = titular;
	}
	public Cliente getTitular(){
		return titular;
	}
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setAgencia(int novaAgencia){
		this.agencia = novaAgencia;
	}
	public int getAgencia(){
		return this.agencia;
	}
}