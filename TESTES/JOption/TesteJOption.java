import javax.swing.JOptionPane;
public class TesteJOption {
	public static void main (String args[]) {
		//Caixa de Mensagem com quebra de linha.
		JOptionPane.showMessageDialog(null,"Mensagem \n em \n caixas!");
		//Input Box com insersão de informação.
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		//Caixa de Mensagem incorporando resposta dada.
		String texto = String.format("Bem vindo %s ao mundo do Java!", nome);
		JOptionPane.showMessageDialog(null, texto);
	}
}
