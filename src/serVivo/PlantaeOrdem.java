package serVivo;
import java.util.Scanner;

public class PlantaeOrdem extends PlantaeClasse{
	
	private String nomeOrdem;
	Scanner scan = new Scanner(System.in);
	
	public PlantaeOrdem() {
		
	}

	public String getNomeOrdem() {
		return nomeOrdem;
	}

	public void setNomeOrdem(String nomeOrdem) {
		this.nomeOrdem = nomeOrdem;
	}

	
	public void cadastrarOrdem() {
		System.out.println("Escreva a ordem: ");
		setNomeOrdem(scan.next());
	}
	
	

}
