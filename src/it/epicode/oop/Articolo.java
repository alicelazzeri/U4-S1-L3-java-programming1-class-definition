package it.epicode.oop;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int pezziDisponibili;

    // Getter

    public int getCodiceArticolo() {
        return codiceArticolo;
    }
    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    // Setter

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }
    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }

    // Costruttore

    public Articolo (int codice, String descrizione, int price, int pezzi) {
        this.codiceArticolo = codice;
        this.descrizioneArticolo = descrizione;
        this.prezzo = price;
        this.pezziDisponibili = pezzi;
    }

    // Metodo della classe

    public void mostraArticolo() {
        System.out.println("Articolo: ");
        System.out.println(
                "Codice articolo: " + this.codiceArticolo + " |" +
                " Descrizione articolo: " + this.descrizioneArticolo + " |" +
                " Prezzo articolo: " + this.prezzo + "€" + " |" +
                " Pezzi disponibili a magazzino : " + this.pezziDisponibili);
    }
}


