package no.hvl.dat100.jplab11.oppgave1;

public abstract class Innlegg {

    // TODO - deklarering av objektvariable
    private String bruker;

    private String dato;

    private int likes;

    private int id;

    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        likes = 0;
    }

    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

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

    public int getLikes() {
        return likes;
    }

    public void doLike() {
        likes++;
    }

    public boolean erLik(Innlegg innlegg) {
        return (innlegg.getId() == this.id);
    }

    @Override
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }

    public // Metoden nedenfor er kun for valgfri oppgave 6
    String toHTML() {
        return "\t\t<h2>" + bruker + "@" + dato + " " + "[" + likes + "]<h2>\n";
    }
}
