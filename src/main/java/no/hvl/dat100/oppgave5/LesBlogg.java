package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";
	private static int id;
	private static String bruker;
	private static String dato;
	private static String tekst;
	private static String url;

	public static Blogg les(String mappe, String filnavn) {

		File fil = new File(mappe, filnavn); //Scuffa drit...
		Blogg b = new Blogg();

		try (Scanner scanner = new Scanner(fil)) {

			while (scanner.hasNextLine()) {

				if (scanner.nextInt() == b.getAntall()) {
					int antall = scanner.nextInt();
					b = new Blogg(antall);
				}
				if (scanner.nextLine().equals(TEKST)) {
					Tekst tekstInnlegg = new Tekst(id,bruker,dato,tekst); //Er dette en akseptabel fremgangsmåte?
				} else if (scanner.nextLine().equals(BILDE)) {
					Bilde bildeInnlegg = new Bilde(id,bruker,dato,tekst,url);

				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return b;
    }
}
