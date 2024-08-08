
public class TesteIf {

	public static void main(String[] args) {
		int media = 60;
		int maxFaltas = 5;
		int nota = 85;
		int faltas = 10;
		if ((nota >= media) &&  (faltas <= maxFaltas)) {
			System.out.println("Aprovado!");
		} else if (nota >= 40) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		System.out.println("Fim do Programa!");
	}

}
