package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private int lengde;
	private int antall;
	private Innlegg[] samling;

	public Blogg() {
		this.antall = 0;
		this.lengde = 20;
		this.samling =  new Innlegg[lengde];
	}

	public Blogg(int lengde) {
		this.lengde = lengde;
		this.antall = 0;
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

			if (samling[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return antall < lengde;
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
		String s = "" + samling.length + "\n";
		for (int i = 0; i < samling.length; i++) {
			s += samling[i].toString();
		}
		return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {

		Innlegg[] newSamling = new Innlegg[lengde];
		if (antall == lengde) {
			newSamling = new Innlegg[lengde * 2];
		}

        if (antall >= 0) System.arraycopy(samling, 0, newSamling, 0, antall);

		samling = newSamling;
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