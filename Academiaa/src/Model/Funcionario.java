package Model;

public class Funcionario {
    private String rg;
    private String cpf;
    private String nome;
    private String sexo;
    private String dtNasc;
    private String celular;
    private String email;
    private String endereco;
    private String cep;
    private String cartao;
    private String dtAdmissao;
    private String senha;
    
 public Funcionario() {
    }

    public Funcionario(String rg, String cpf, String nome, String sexo, String dtNasc, String celular, String email, String endereco, String cep, String cartao, String dtAdmissao, String senha) {
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.cartao = cartao;
        this.dtAdmissao = dtAdmissao;
        this.senha = senha;
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

    public String getCartao() {
        return cartao;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getSenha() {
        return senha;
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

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "rg=" + rg + ", cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dtNasc=" + dtNasc + ", celular=" + celular + ", email=" + email + ", endereco=" + endereco + ", cep=" + cep + ", cartao=" + cartao + ", dtAdmissao=" + dtAdmissao + ", senha=" + senha + '}';
    }
 
}
