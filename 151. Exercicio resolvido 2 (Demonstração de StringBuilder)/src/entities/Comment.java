package entities;

public class Comment {
	
	private String texte;
	
	Comment(){
		
	}

	public Comment(String texte) {
		this.texte = texte;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
	
}
