
package Model;


public class Funcionario extends Pessoas {
    private String dtAdmissao;
   
    private String senha;

    public Funcionario(int id, String rg, String cpf, String nome, String sexo, String dtNasc, String celular, String email, String endereco, String cep, String estado, String cidade, String bairro, String cartao) {
        super(id, rg, cpf, nome, sexo, dtNasc, celular, email, endereco, cep, estado, cidade, bairro, cartao);
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
    

}
