
package Model;


public class Funcionario {
    private String dtAdmissao;
    private String senha;
    
    public Funcionario() {
    }

    public Funcionario(String dtAdmissao, String senha) {
        this.dtAdmissao = dtAdmissao;
        this.senha = senha;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setDtAdmissao(String dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "dtAdmissao=" + dtAdmissao + ", senha=" + senha + '}';
    }

}
