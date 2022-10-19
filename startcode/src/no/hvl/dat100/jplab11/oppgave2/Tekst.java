package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

    public Tekst(int id, String bruker, String dato, String tekst) {
        throw new UnsupportedOperationException("The constructor for the class Tekst is not implemented");
    }

    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        throw new UnsupportedOperationException("The constructor for the class Tekst is not implemented");
    }

    public String getTekst() {
        throw new UnsupportedOperationException("The method getTekst is not implemented");
    }

    public void setTekst(String tekst) {
        throw new UnsupportedOperationException("The method setTekst is not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("The method toString is not implemented");
    }

    public // Metoden nedenfor er kun for valgfri oppgave 6
    String toHTML() {
        throw new UnsupportedOperationException("The method toHTML is not implemented");
    }
}
