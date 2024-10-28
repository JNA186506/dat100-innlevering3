package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private int lengde;
	private int antall;
	private Innlegg[] samling;
	
	
	
	
	
	// TODO: objektvariable 

	public Blogg() {
		this.lengde = 0;
		this.antall = 20;
		this.samling = new Innlegg[antall];
	
	}

	public Blogg(int lengde) {
		this.lengde = lengde;
		this.antall = 20;
		this.samling = new Innlegg[lengde];
		
}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return samling;
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int pos = 0;
		for (int i = 0; i < samling.length; i++) {
			if (samling[i] == null) {
				pos = -1;
			}
			if (samling[i].erLik(innlegg)) {
				pos = i;
			}
		}
		return pos;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		return finnInnlegg(innlegg) != -1;	
		
		
	}

	public boolean ledigPlass() {
		return antall<lengde;
		

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!ledigPlass()) {
			return false;
		}
			for (int i = 0; i < samling.length; i++) {
				if (samling[i] == null) {
					samling[i] = innlegg;
					antall++;
					return true;
				}
			}
		
		return false;
					
			
		}
	
	
	public String toString() {
		
		String s = "" + samling.length + "";
		
		
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}