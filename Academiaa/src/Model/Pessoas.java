
package Model;

/**
 *
 * @author 181910174
 */
class Pessoas {
    private int id;
    private String rg;
    private String cpf;
    private String nome;
    private String sexo;
    private String dtNasc;
    private String celular;
    private String email;
    private String endereco;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String cartao;

    public Pessoas(int id, String rg, String cpf, String nome, String sexo, String dtNasc, String celular, String email, String endereco, String cep, String estado, String cidade, String bairro, String cartao) {
        this.id = id;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cartao = cartao;
    }

    public int getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCartao() {
        return cartao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "id=" + id + ", rg=" + rg + ", cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dtNasc=" + dtNasc + ", celular=" + celular + ", email=" + email + ", endereco=" + endereco + ", cep=" + cep + ", estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", cartao=" + cartao + '}';
    }

}