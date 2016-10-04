package main;

import rubrica.Rubrica;
import rubrica.VoceGiaEsiste;
import rubrica.VoceNonEsiste;

public class testRubricaConGino {

	public static void main(String[] args){
		
		// CREAZIONE NUOVA RUBRICA
		
		Rubrica r = new Rubrica("Rubrica");
		
		// AGGIUNGO VOCI A RUBRICA  OK!!!
		
		try{
		
		r.aggiungiVoce("Andrea", "Gino", "3342565456");
		r.aggiungiVoce("Grazia", "Digilio", "3376545432");
		r.aggiungiVoce("Grazia", "Digilio", "3376545432");
		
		
		} catch(VoceGiaEsiste e){
			System.out.println("Voce già presente!");
		}
		
		System.out.println(r.toStringVoci());
		
		try{
			r.getVoce("Andrea","Gino", "3342565456");
			r.getVoce("Grazia", "Digilio", "3376545432");
			r.getVoce("Vahid", "Digilio", "3376545432");
		
		}catch(VoceNonEsiste e){
			System.out.println("Voce non presente!");
		}
	}

}
