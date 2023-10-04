package entities;

public class People {
	
	public String name;
	public int idade;
	
	public People(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	public String toString() {
		return name + " " + idade;
	}
}
