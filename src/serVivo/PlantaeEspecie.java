package serVivo;

import java.util.Scanner;

public class PlantaeEspecie extends PlantaeGenero{
    
	String nomeEspecie;
	Scanner scan = new Scanner(System.in);
	
	public PlantaeEspecie() {
		
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	public void cadastrarEspecie() {
		System.out.println("Escreva a Espécie: ");
		setNomeEspecie(scan.next());
	}
}
