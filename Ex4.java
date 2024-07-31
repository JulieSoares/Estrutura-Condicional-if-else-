import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Inicio = sc.nextInt();
		int Final = sc.nextInt();
		
		int Tempo;
		if (Inicio <  Final) {
			Tempo = Final - Inicio;
		}
		else {
			Tempo = 24 - Inicio + Final;
		}
		
		System.out.println("O JOGO DUROU " + Tempo + " HORA(S)");
		
		sc.close();
	}
}

