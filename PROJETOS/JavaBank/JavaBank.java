public class JavaBank {
	public static void main(String[] args){
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Mateus");
		cliente1.setCPF("111.111.111-11");
		cliente1.setProfissao("Programador");
		Conta conta1 = new Conta();
		conta1.setTitular(cliente1);
		conta1.deposita(1000.00);
		System.out.println("Titular da Conta1: " + conta1.getTitular().getNome());
		System.out.println("CPF do Titular da Conta1: " + conta1.getTitular().getCPF());
		System.out.println("Saldo atual da Conta1: " + conta1.getSaldo());
		conta1.saca(500.00);
		System.out.println("Novo saldo apos saque da Conta1: " + conta1.getSaldo());
		Conta conta2 = new Conta();
		conta2.deposita(1500.00);
		conta2.transfere(500.00, conta1);
		System.out.println("Novo saldo apos transferencia para da Conta1: " + conta1.getSaldo());
	}
}