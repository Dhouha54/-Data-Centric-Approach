package Controller ;


import model.Etudiant;
import Controller.EtudiantDoe;
public class main {
	public static void main(String[] args) {
		
		Etudiant etu = new Etudiant(22,"imene");
		EtudiantDoe doe = new EtudiantDoe(etu);
		doe.create(etu);
		doe.update(etu,"dida");
		doe.read();
	}

}