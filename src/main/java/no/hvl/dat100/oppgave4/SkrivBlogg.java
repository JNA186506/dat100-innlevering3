package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	// Eksempel:

//	2
//	TEKST
//	1
//	Ole Olsen
//	23-10
//	0
//	en tekst
//	BILDE
//	2
//	Oline Olsen
//	24-10
//	0
//	et bilde
//	http://www.picture.com/oo.jpg

	// Metoden skal returnere ture om filen ble skrevet og skal håndtere eventuelle
	// unntak ifm. fil-håndtering ved å bruke try-catch.

	// Hint:bruk toString()-metoden på innlegg-samling. Filen bloggkorrekt.dat i
	// Eclipse-prosjektet med tester inneholder korrekt resultat. Når testen
	// TestSkriv-testen kjøres vil der bli skrevet i filen blogg.dat der resultatet
	// kan inspiseres. Dvs. om metoden er korrekt implementert skal innholdet av
	// filen blogg.dat være lik innholdet av filen bloggkorrekt.dat

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			File file = new File (mappe + filnavn);
			PrintWriter writer = new PrintWriter(file);
			writer.print(samling.toString());
			writer.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
