package rubrica;

public class Voce {
	
	// ATTRIBUTI
	private String nome;
	private String cognome;
	private String telefono;
	
	// COSTRUTTORE VUOTO
	public Voce() {
	}
	
	// COSTRUTTORE CON DATI
	public Voce(String nome, String cognome, String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	
	// METODI GET E SET
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	// METODO TO STRING
	public String toStringVoce(){
		String str = "";
		str += nome + " " + cognome + " " + telefono + "\n";
		return str;
	}
	

}