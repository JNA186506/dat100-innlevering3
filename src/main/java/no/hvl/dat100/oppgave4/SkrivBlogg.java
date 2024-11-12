package no.hvl.dat100.oppgave4;

import java.io.*;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		File file = new File(mappe, filnavn);

		try {
			FileWriter blogg = new FileWriter(file);
			PrintWriter out = new PrintWriter(blogg);
			out.write(samling.toString());
			out.close();
			return true;

		} catch (IOException e) { //Lage en mer robust exception handler?
			throw new RuntimeException("Something went wrong", e);
		}
	}
}
