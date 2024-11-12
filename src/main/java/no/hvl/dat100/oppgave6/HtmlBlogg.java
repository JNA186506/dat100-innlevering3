package no.hvl.dat100.oppgave6;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

    public HtmlBlogg() {
        super();
    }

    private static String HTMLPREFIX =
            "<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";

    private static String HTMLPOSTFIX =
            "\t</body>\n</html>";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(HTMLPREFIX);

        for (Innlegg innlegg : getSamling()) { //Legger til en ekstra <hr> etter tekst ved Bilde innlegg, potensiell forbedring
            if (innlegg != null) {
                if (innlegg instanceof Tekst) {
                    sb.append(innlegg.toHTML());
                }
            }
        }
        sb.append(HTMLPOSTFIX);
        return sb.toString();
    }
}
