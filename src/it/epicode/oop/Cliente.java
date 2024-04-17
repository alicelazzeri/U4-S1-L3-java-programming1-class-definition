package it.epicode.oop;

public class Cliente {
    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    // Getter

    public int getCodiceCliente() {
        return codiceCliente;
    }
    public String getNomeCognome() {
        return nomeCognome;
    }
    public String getEmail() {
        return email;
    }
    public String getDataIscrizione() {
        return dataIscrizione;
    }

    // Setter

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }
    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    // Costruttore

    public Cliente (int codice, String nomCogn, String mail, String data) {
        this.codiceCliente = codice;
        this.nomeCognome = nomCogn;
        this.email = mail;
        this.dataIscrizione = data;
    }

    // Metodo della classe

    public void mostraCliente () {
        System.out.println("Cliente: ");
        System.out.println(
                "Codice cliente: " + this.codiceCliente + " |" +
                        " Nome e cognome: " + this.nomeCognome + " |" +
                        " Email: " + this.email + " |" +
                        " Data di iscrizione : " + this.dataIscrizione);
    }
}
