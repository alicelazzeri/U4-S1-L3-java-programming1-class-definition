package it.epicode.oop;

public class Sim {
    private int numeroTelefono;
    private int credito;
    private Chiamata[] chiamate;
    public class Chiamata {
        private int minuti;
        private int numeroChiamato;

        public Chiamata (int min, int numChiam) {
            this.minuti = min;
            this.numeroChiamato = numChiam;
        }

        public int getMinuti() {
            return minuti;
        }
        public int getNumeroChiamato() {
            return numeroChiamato;
        }

        public void setMinuti(int minuti) {
            this.minuti = minuti;
        }
        public void setNumeroChiamato(int numeroChiamato) {
            this.numeroChiamato = numeroChiamato;
        }
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }
    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public Sim(int numTel) {
        this.numeroTelefono = numTel;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void stampaSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Chiamate effettuate sul numero: " + numeroTelefono);
        for (int chiam = 0; chiam < chiamate.length; chiam++) {
            Chiamata chiamata = chiamate[chiam];
            if (chiamata != null) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + " | Durata della chiamata: " + chiamata.getMinuti() + " minuti");
            }
        }
    }

}
