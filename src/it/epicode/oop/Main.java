package it.epicode.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Esercizio 1

        Rettangolo rettangolo1 = new Rettangolo(30, 50);
        Rettangolo rettangolo2 = new Rettangolo(20, 60);
        int areaRettangolo1 = rettangolo1.calcoloArea();
        int areaRettangolo2 = rettangolo2.calcoloArea();
        int perimetroRettangolo1 = rettangolo1.calcoloPerimetro();
        int perimetroRettangolo2 = rettangolo2.calcoloPerimetro();
        rettangolo1.stampaRettangolo(rettangolo1);
        rettangolo2.stampaRettangolo(rettangolo2);
        rettangolo1.stampaRettangoli(rettangolo1,rettangolo2);
        rettangolo2.stampaRettangoli(rettangolo1, rettangolo2);
        System.out.println("Somma delle aree: " + (areaRettangolo1 + areaRettangolo2));
        System.out.println("Somma dei perimetri: " + (perimetroRettangolo1 + perimetroRettangolo2));

        // Esercizio 2

        Sim sim = new Sim(123456789);
        sim.setCredito(50);
        sim.getChiamate()[0] = sim.new Chiamata(5, 565775657);
        sim.getChiamate()[1] = sim.new Chiamata(40, 326544633);
        sim.getChiamate()[2] = sim.new Chiamata(35, 678897786);
        sim.getChiamate()[3] = sim.new Chiamata(2, 457635878);
        sim.getChiamate()[4] = sim.new Chiamata(19, 536647272);
        sim.stampaSim();

        //Esercizio 3

        Articolo articolo = new Articolo(1234, "Giacca in denim blu scuro", 145, 50);
        articolo.mostraArticolo();

        Cliente cliente = new Cliente(4321, "Alice Lazzeri", "alice@outlook.com", "02-09-2024");
        cliente.mostraCliente();


    }
}