package rubrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	// ATTRIBUTI
	private String nome;
	private Map<String,Voce> voci = new TreeMap<String,Voce>();
	
	// COSTRUTTORE VUOTO
	public Rubrica() {
	}
	
	// COSTRUTTORE CON ATTRIBUTO NOME
	public Rubrica(String nome) {
		this.nome = nome;
	}
	
	// METODI GET E SEI
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
	
	/*METODO CHE CONTROLLA SE ESISTE LA VOCE PASSATA COME PARAMETRO
	 *SE ESISTE LANCIA ERRORE
	 *ALTRIMENTI AGGIUNGE LA NUOVA VOCE E LA RITORNA
	 */
	public Voce aggiungiVoce(String nome,String cognome,String telefono)throws VoceGiaEsiste{
		
		Voce v = null;
		
		if(voci.containsKey(nome+" "+cognome)){
			throw new VoceGiaEsiste("Voce esistente in Rubrica!");
		}
		
		v = new Voce(nome,cognome,telefono);
		voci.put(nome+" "+cognome,v);
		
		return v;
	}
	
	/*METODO CHE CONTROLLA SE ESISTE LA VOCE PASSATA COME PARAMETRO
	 *SE NON ESISTA LANCIA ERRORE
	 *ALTRIMENTI RITORNA LA VOCE
	 */
	public Voce getVoce(String nome,String cognome,String telefono)throws VoceNonEsiste{
		
		Voce v = null;
		
		if(!voci.containsKey(nome+" "+cognome)){
			throw new VoceNonEsiste("Voce non presente in Rubrica!");
		}
		
		v = voci.get(nome+" "+cognome);
		return v;
	}
	
	/*METODO CHE CONTROLLA SE LA LISTA E NULLA
	 * SE E' NULLA LANCIA ECCEZIONE
	 * ALTRIMENTI RITORNA LA LISTA DELLE VOCI
	 */
	public List<Voce> getTuttiVoci() throws VoceNonEsiste{
		
		List<Voce> vTemp = null;
		
		if(voci == null){
			throw new VoceNonEsiste("Rubrica vuota!");
		}
		
		vTemp = new ArrayList<Voce>(voci.values()); // TRASFORMO DA MAPPA VOCI A LISTA VOCI
		
		return vTemp;
	}
	
	/*METODO CHE CONTROLLA SE ESISTE LA VOCE PASSATA COME PARAMETRO
	 * SE NON ESISTE LANCIA ECCEZIONE
	 * ALTRIMENTI AGGIORNA LA VOCE CON I NUOVI DATI	E LA RITORNA
	 */
	public Voce aggiornaVoce(String nome,String cognome,String telefono)throws VoceNonEsiste{
		
		Voce v=null;
		
		if(!voci.containsKey(nome+" "+cognome)){
			throw new VoceNonEsiste("Voce non presente");
		}
		
		voci.get(nome+" "+cognome).setTelefono(telefono);
		v=new Voce(nome,cognome,telefono);
		
		return v;
	}
	
	/*METODO CHE CONTROLLA SE ESISTE LA VOCE PASSATA COME PARAMETRO
	 * SE NON ESISTE LANCIA ECCEZIONE
	 * ALTRIMENTI CANCELLA LA VOCE E LA RITORNA	
	 */
	public Voce cancellaVoce(String nome,String cognome)throws VoceNonEsiste{
		
		Voce v = null;
		
		if(!voci.containsKey(nome+" "+cognome)){
			throw new VoceNonEsiste("Voce non presente!");	
		}
		
		v = voci.get(nome+" "+cognome);
		voci.remove(nome+" "+cognome);
		
		return v;
	}

	
	
	
	
	
	
	

}
