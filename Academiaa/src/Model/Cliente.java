package Model;

public class Cliente {


    private int plano;
    private String nome;
    private String endereco;
    private float altura;
    private float peso;
    private float imc;
    private String ultimoAcesso;
    private String cpf;

    public Cliente() {
    }
    public Cliente(int plano, String nome, String endereco, float altura, float peso, float imc, String ultimoAcesso, String cpf) {
        this.plano = plano;
        this.nome = nome;
        this.endereco = endereco;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.ultimoAcesso = ultimoAcesso;
        this.cpf = cpf;
    }

    public int getPlano() {
        return plano;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getImc() {
        return imc;
    }

    public String getUltimoAcesso() {
        return ultimoAcesso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public void setUltimoAcesso(String ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "plano=" + plano + ", nome=" + nome + ", endereco=" + endereco + ", altura=" + altura + ", peso=" + peso + ", imc=" + imc + ", ultimoAcesso=" + ultimoAcesso + ", cpf=" + cpf + '}';
    }

}
