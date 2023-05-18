
package Model;


public class Plano {
    private int id;
    private String nome;
    private String descricao;
    private float valor;
    private int vencimento;

    public Plano() {
    }
        
    public Plano(int id, String nome, String descricao, float valor, int vencimento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Plano{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", vencimento=" + vencimento + '}';
    }
    
}
