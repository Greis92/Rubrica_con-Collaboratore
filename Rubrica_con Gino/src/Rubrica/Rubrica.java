package Rubrica;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private String nome;
	private Map<String,Voce> voci = new TreeMap<String,Voce>();
	
	public Rubrica() {
	}
	
	public Rubrica(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Map<String, Voce> getVoci() {
		return voci;
	}

	public void setVoci(Map<String, Voce> voci) {
		this.voci = voci;
	}

	public Voce aggiungiVoce(String nome,String cognome,String telefono)throws VoceGiaEsiste{
		
		Voce v = null;
		
		if(voci.containsKey(nome+" "+cognome)){
			throw new VoceGiaEsiste("Voce esistente in Rubrica!");
		}
		v = new Voce(nome,cognome,telefono);
		voci.put(nome+" "+cognome,v);
		
		return v;
	}
	
	public Voce getVoce(){
		return null;
	}
	
	public List<Voce> getTuttiVoci(){
		return null;
	}
	
	public Voce aggiornaVoce(String nome,String cognome,String telefono){
		return null;
	}
	
	public Voce cancellaVoce(String nome,String cognome){
		return null;
	}

	
	
	
	
	
	
	

}
