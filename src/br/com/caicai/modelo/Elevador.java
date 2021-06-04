package br.com.caicai.modelo;

public class Elevador {

	// Inicio dos atributos
	private String nome;
	private int maximoPessoas;
	private int andarMaximo;
	private int andarMinimo;
	private int andarAtual;
	private int qtdePessoas;
	// fim dos atributos

	// inicio dos getters and setters
	public void inicializar(String pNome, int pMaxPessoas, int pAndarMax, int pAndarMin) {
		nome = pNome;
		maximoPessoas = pMaxPessoas;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
	}

	public void entrar() {
		if (qtdePessoas < maximoPessoas) {
			qtdePessoas++;
		}
	}

	public String subir(int andar) {
		if ((andarAtual + andar) <= andarMaximo) {
			andarAtual += andar;
			return "Subindo";
		}
		return "Não foi possível subir";
	}

	public String descer(int andar) {
		if ((andarAtual - andar) >= andarMinimo) {
			andarAtual -= andar;
			return "Descendo";
		}
		return "Não foi possível descer";
	}

	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas -= 1;
		}
	}
	// fim dos getters and setters

	// inicio do toString
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andarAtual=" + andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}
	// fim do toString

}
