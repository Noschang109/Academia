
package Model;


public class Plano {
    private int id;
    private String nome;
    private String descricao;
    private float valor;
    private int vencimento;
    private String carga;
    private String repeticoes;
    private String series;

    public Plano() {
    }

    public Plano(int id, String nome, String descricao, float valor, int vencimento, String carga, String repeticoes, String series) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
        this.carga = carga;
        this.repeticoes = repeticoes;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Plano{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", vencimento=" + vencimento + ", carga=" + carga + ", repeticoes=" + repeticoes + ", series=" + series + '}';
    }
        
    
    
}
