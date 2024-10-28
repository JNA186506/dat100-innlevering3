package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private int lengde;
	private int antall;
	private Innlegg[] samling;
	private int nesteLedige = 0;
	
	
	
	
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
		for (int i = 0; i < samling.length; i++) {
			if (samling[i] == null) {
				return -1;
			}
			if (samling[i].erLik(innlegg))
		}
		
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {

		if (fant) {
			fant = true;
			return fant;
		}else {
			return fant;
			
		}
			
			
		
		
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		
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