package no.hvl.dat100.jplab11.oppgave1;

public abstract class Innlegg {

    // TODO - deklarering av objektvariable
    public Innlegg(int id, String bruker, String dato) {
        throw new UnsupportedOperationException("The constructor for the class Innlegg is not implemented");
    }

    public Innlegg(int id, String bruker, String dato, int likes) {
        throw new UnsupportedOperationException("The constructor for the class Innlegg is not implemented");
    }

    public String getBruker() {
        throw new UnsupportedOperationException("The method getBruker is not implemented");
    }

    public void setBruker(String bruker) {
        throw new UnsupportedOperationException("The method setBruker is not implemented");
    }

    public String getDato() {
        throw new UnsupportedOperationException("The method getDato is not implemented");
    }

    public void setDato(String dato) {
        throw new UnsupportedOperationException("The method setDato is not implemented");
    }

    public int getId() {
        throw new UnsupportedOperationException("The method getId is not implemented");
    }

    public int getLikes() {
        throw new UnsupportedOperationException("The method getLikes is not implemented");
    }

    public void doLike() {
        throw new UnsupportedOperationException("The method doLike is not implemented");
    }

    public boolean erLik(Innlegg innlegg) {
        throw new UnsupportedOperationException("The method erLik is not implemented");
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
