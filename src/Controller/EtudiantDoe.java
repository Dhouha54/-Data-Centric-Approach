package Controller;

import model.Etudiant;

public class EtudiantDoe {
	ConnectionBD conn = new ConnectionBD();  //attribut
	Etudiant e ;
	public EtudiantDoe(Etudiant e) {
		super();
		this.e = e;
	}
	public void create(Etudiant e) {
		conn.MiseAJour("insert into student values(" + e.getId() + "," +"\""+ e.getNom()+"\""+");");
	}
	public void read() {
		conn.lire("select * from student");
	}
	public void update(Etudiant e ,String n) {
		conn.MiseAJour("UPDATE student"
				+ " SET names = \""+ n + "\""
				+ " WHERE id="+ e.getId()+";");
	}
	public void delete(Etudiant e) {
		conn.MiseAJour("delete from student where id="+ e.getId()+";");
	}
}
