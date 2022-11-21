package serVivo;
import java.util.Scanner;

public class PlantaeClasse extends PlantaeFilo{
	
	private String nomeClasse;
	Scanner scan = new Scanner(System.in);
	
	public PlantaeClasse() {
		
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

	
	public void cadastrarClasse() {
		System.out.println("Escreva a classe: ");
		setNomeClasse(scan.next());
	}
	
	

}
