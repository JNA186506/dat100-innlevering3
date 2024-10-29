package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// Oppgave a)
	// Deklarering av objektvariable
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	// Oppgave b)
	// Klassen skal ha to konstruktører:
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	// Oppgave c)
	// Get- og set-metoder for objektvariable id, bruker og dato
	
	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int nummer) { // skal med? bruker den jo senere
		this.id = nummer;
	}

	// Oppgave d)
	// Implementer metoden void doLike() som øker antall likes for innlegget med 1.
	
	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes++;
	}
	
	// Oppgave f)
	// True hvis og kun hvis innlegget har samme id som innlegget innlegg gitt med som parameter
	
	public boolean erLik(Innlegg innlegg) {
		boolean I = false;
		if (innlegg.getId()==id) {
			I = true;
		}
		return I;
		// Gitt navnet til en boolean (tydelig frem hva som returneres)
	}
	
	@Override // --> Nå skriver denne over metoden
	
	// Oppgave e)
	// Returnerer "1\nOle Olsen\n23-10\n7\n"
	
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
