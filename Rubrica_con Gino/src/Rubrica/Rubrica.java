package rubrica;

import java.util.ArrayList;
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

	public Voce getVoce(String nome,String cognome,String telefono)throws VoceGiaEsiste{
		
		Voce v = null;
		
		if(voci.containsKey(nome+" "+cognome)){
			throw new VoceGiaEsiste("Voce esistente in Rubrica!");
		}
		v = new Voce(nome,cognome,telefono);
		voci.put(nome+" "+cognome,v);
		
		return v;
	}
	
	public List<Voce> getTuttiVoci() throws VoceGiaEsiste{
		
		List<Voce> vTemp = null;
		
		if(voci == null){
			throw new VoceGiaEsiste("Rubrica vuota!");
		}
		
		vTemp = new ArrayList<Voce>(voci.values());
		
		return vTemp;
	}
	
	public Voce aggiornaVoce(String nome,String cognome,String telefono)throws VoceNonEsiste{
		
		Voce v=null;
		if(!voci.containsKey(nome+" "+cognome)){
			throw new VoceNonEsiste("Voce non presente");
		}
		voci.get(nome+" "+cognome).setTelefono(telefono);
		v=new Voce(nome,cognome,telefono);
		
		return v;
	}
	
	public Voce cancellaVoce(String nome,String cognome)throws VoceGiaEsiste{
		
		Voce v = null;
		
		if(!voci.containsKey(nome+" "+cognome)){
			throw new VoceGiaEsiste("Voce non presente!");	
		}
		
		v = voci.get(nome+" "+cognome);
		
		voci.remove(nome+" "+cognome);
		
		return v;
	}

	
	
	
	
	
	
	

}
