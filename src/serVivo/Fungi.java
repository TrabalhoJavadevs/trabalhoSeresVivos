package serVivo;
import java.util.Scanner;

public class Fungi {
	private String nomePadrao ;
	Scanner scan = new Scanner(System.in);
	
	public Fungi(){
		
	}
	public String getNomePadrao() {
		return nomePadrao;
	}
	public void setNomePadrao(String nomePadrao) {
		this.nomePadrao = nomePadrao;
	}
	public void cadastrarNomePadrao() {
		System.out.println("Escreva o nome padrão: ");
		setNomePadrao(scan.next());
	}
}