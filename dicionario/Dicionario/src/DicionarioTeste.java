
import javax.swing.JOptionPane;

public class DicionarioTeste {

	public static void main(String[] args) {

		DicionarioTeste novo = new DicionarioTeste();

		int opc = 0;

		while (opc != 9) {

			opc = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada\n1 - Buscar palavra\n9 - Sair"));

			switch (opc) {
			case 1:
				novo.iniciarBusca();
				break;
			case 9:
				System.out.println("\nFIM");
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		}

	}

	void iniciarBusca() {

		Dicionario d1 = new Dicionario();
		String palavra;
		
		palavra = JOptionPane.showInputDialog("Informe a palavra desejada");

		d1.exibir(palavra);
		
	}
}
