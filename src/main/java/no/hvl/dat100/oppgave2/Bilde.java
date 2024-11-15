package no.hvl.dat100.oppgave2;

import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst { //Extender Tekst, men burde kanskje extende innlegg?

    private String url;

    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        super(id, bruker, dato, tekst);
        this.url = url;
    }

    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        super(id, bruker, dato, likes, tekst);
        this.url = url;
    }

    public String getUrl() {
        return url;

    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        String h = "\n\t" + super.toHTML();
        StringBuilder html = new StringBuilder();
        html.append(h)
                .append("\n\t\t<iframe src=\"")
                .append(url)
                .append("\"></iframe>\n");

        return html.toString();
    }
}
