package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

    private static String TEKST = "TEKST";
    private static String BILDE = "BILDE";

    public static Blogg les(String mappe, String filnavn) {

        File file = new File(mappe, filnavn);
        Blogg b = new Blogg();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            int antall = Integer.parseInt(line);

            for (int i = 0; i < antall; i++) {
                line = br.readLine();
                if (line.equals(TEKST)) {
                    int id = Integer.parseInt(br.readLine());
                    String bruker = br.readLine();
                    String dato = br.readLine();
                    int likes = Integer.parseInt(br.readLine());
                    String tekst = br.readLine();

                    Tekst tekstInnlegg = new Tekst(id, bruker, dato, likes, tekst);
                    b.leggTil(tekstInnlegg);
                } else if (line.equals(BILDE)) {
                    int id = Integer.parseInt(br.readLine());
                    String bruker = br.readLine();
                    String dato = br.readLine();
                    int likes = Integer.parseInt(br.readLine());
                    String tekst = br.readLine();
                    String url = br.readLine();

                    Bilde bildeInnlegg = new Bilde(id, bruker, dato, likes, tekst, url);
                    b.leggTil(bildeInnlegg);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found:" + file, e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file:" + file, e);
        }


        return b;
    }
}
