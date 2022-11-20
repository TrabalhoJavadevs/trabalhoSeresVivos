package serVivo;

import java.util.Scanner;

public class FungiGenero extends FungiFamilia{
	private String nomeGenero;
	Scanner scan = new Scanner(System.in);
	
	public FungiGenero() {
		
	}

	public String getNomeGenero() {
		return nomeGenero;
	}

	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}

	
	public void cadastrarGenero() {
		System.out.println("Escreva o Gênero: ");
		setNomeGenero(scan.next());
	}
}
