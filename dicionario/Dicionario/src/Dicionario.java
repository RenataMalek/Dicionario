import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dicionario {

	String palavra;
	String significado;

	static ArrayList<Dicionario> palavras = new ArrayList<Dicionario>();

	void adicionarPalavras(String palavra, String significado) {
		Dicionario armazenar = new Dicionario();

		armazenar.palavra = palavra;
		armazenar.significado = significado;

		palavras.add(armazenar);

	}

	public String getPalavra() {
		return this.palavra;
	}
	
	public String toString() {
		return "A palavra " +  this.palavra + " significa " + this.significado + "\n";
	}

	void exibir(String plv) {

		int cont = 0;

		String sign;
		for (int i = 0; i < palavras.size(); i++) {
			if (palavras.get(i).getPalavra().equals(plv)) {
				System.out.println(palavras.get(i));
				cont++;
				break;
			}
		}

		if (cont == 0) {
			sign = JOptionPane
					.showInputDialog("Palavra não cadastrada, por favor informe o significado para armazenamento");
			adicionarPalavras(plv, sign);
			JOptionPane.showMessageDialog(null, "Palavra foi armazenada.");
		}
	}
}
