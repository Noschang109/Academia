
package Model;


public class Pagamento {
    private String PgHora;
    private String pgData;

    public Pagamento() {
    }
    
    
    public Pagamento(String PgHora, String pgData) {
        this.PgHora = PgHora;
        this.pgData = pgData;
    }

    public String getPgHora() {
        return PgHora;
    }

    public String getPgData() {
        return pgData;
    }

    public void setPgHora(String PgHora) {
        this.PgHora = PgHora;
    }

    public void setPgData(String pgData) {
        this.pgData = pgData;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "PgHora=" + PgHora + ", pgData=" + pgData + '}';
    }
    
}
