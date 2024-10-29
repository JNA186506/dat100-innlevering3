package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// Oppgave a)
	// innleggtabell som er en referanse tabell av Innlegg-objekt
	// nesteledig som angir antall Innlegg-objekt som er lagret i tabellen og dermed
	// neste ledige posisjon i tabellen.

	private Innlegg[] innleggtab;
	private int nesteledig;
	// Fyll inn i tabellen og da skal den nye variabelen alltid bli lagt inn på
	// plassen til nesteledige og nesteledige sin verdi skal økes.

	// Oppgave b)
	// Konstruktør der størrelsen på tabellen blir satt til 20.

	public Blogg() {
		this(20);
	}

	// Konsturktør der parameteren angir lengden angir startstørrelsen på tabellen.

	public Blogg(int lengde) {
		this.innleggtab = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	// Oppgave c)
	// Returnerer antall innlegg-objekt som aktuelt er lagret i tabellen.

	public int getAntall() {
		return nesteledig;
	}

	// Oppgave d)
	// Returnerer en peker til tabellen av innlegg-objekt.

	public Innlegg[] getSamling() {
		return this.innleggtab;
	}

	// Oppgave e)
	// Returnerer indeks (posisjon) i tabellen for et innlegg i samlingen med samme
	// id som parameteren innlegg (og en slik finnes) og -1 ellers. Bruk
	// erLik-metoden for Innlegg-objekt i implementasjonen.

	public int finnInnlegg(Innlegg innlegg) {
		int x = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtab[i].erLik(innlegg)) {
				x = i;
			}
		}
		return x;
	}

	// Oppgave f)
	// Returnerer true om det finnes et innlegg i samlingen med samme id som
	// innlegget gitt ved parameteren innlegg.

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtab[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	// Oppgave g)
	// Returnerer true om det er ledig plass i samlingen og false ellers.

	public boolean ledigPlass() {
		return nesteledig < innleggtab.length;
	}

	// Oppgave h)
	// Legger innlegg inn i tabellen. Dersom det ikke finnes et innlegg i tabellen
	// med samme id som innlegg skal metoden legge til innlegget på neste ledige
	// plass i tabellen. Ellers skal ikke metoden legge inn innlegg i tabellen.
	// Metoden skal returnere true om innlegget ble lagt til og false ellers.

	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg) && ledigPlass()) {
			return false;
		}
		innleggtab[nesteledig] = innlegg;
		nesteledig++;
		return true;
	}

	// Oppgave i)
	// Returnerer data i tabellen som en streng der første linje i strengen angir
	// antall Innlegg-objekt i tabellen, eks. en tabell med to innlegg (et
	// tekst-innlegg og et bilde-innlegg): "2\nTEKST\n1\nOle Olsen\n23-10\n0\nen
	// tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net
	// bilde\nhttp://www.picture.com/oo.jpg\n".

	public String toString() {
		String x = nesteledig + "\n";
		for (int i = 0; i < innleggtab.length; i++) {
			if (innleggtab[i] != null) {
				x += innleggtab[i].toString();
			}
		}
		return x;
	}

	// valgfrie oppgaver nedenfor

	// Oppgave j)
	// Oppretter en ny tabell av innlegg-objekt som er dobbelt så stor og flytter
	// elementene over i denne.

	public void utvid() {
		Innlegg[] nytab = new Innlegg[innleggtab.length * 2];
		for (int i = 0; i < nesteledig; i++) {
			nytab[i] = innleggtab[i];
		}
		innleggtab = nytab;
	}

	// Oppgave k)
	// Legger innlegg inn i tabellen. Dersom det ikke finnes et innlegg i tabellen
	// med samme id som innlegg skal metoden legge til innlegget på neste ledige
	// plass i tabellen. Ellers skal ikke metoden legge inn innlegg i tabellen.
	// Dersom tabellen er full, skal metoden opprette en utvidet tabell og deretter
	// sette inn innlegget i den nye tabellen. Metoden skal returnere true om
	// innlegg ble lagt inn i tabellen.

	public boolean leggTilUtvid(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		}
		if (!ledigPlass()) {
			utvid();
		}
		innleggtab[nesteledig] = innlegg;
		nesteledig++;
		return true;
	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}