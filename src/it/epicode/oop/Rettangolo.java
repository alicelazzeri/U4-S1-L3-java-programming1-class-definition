package it.epicode.oop;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public int getAltezza() {
        return altezza;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }
    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public Rettangolo(int a, int l) {
        System.out.println("Costruttore di Rettangolo");
        this.altezza = a;
        this.larghezza = l;
    }

    public int calcoloPerimetro() {
        return (altezza + larghezza) * 2;
    }

    public int calcoloArea() {
        return altezza * larghezza;
    }

    public void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area del rettangolo: " + rettangolo.calcoloArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcoloPerimetro());
    }

    public void stampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Perimetro e area di Rettangolo 1: ");
        stampaRettangolo(rettangolo1);

        System.out.println("Perimetro e area di Rettangolo 2: ");
        stampaRettangolo(rettangolo2);

        int sommaArea = rettangolo1.calcoloArea() + rettangolo2.calcoloArea();
        int sommaPerimetro = rettangolo1.calcoloPerimetro() + rettangolo2.calcoloPerimetro();
        System.out.println("Totale delle aree dei rettangoli: " + sommaArea);
        System.out.println("Totale delle aree dei rettangoli: " + sommaPerimetro);
    }
}
