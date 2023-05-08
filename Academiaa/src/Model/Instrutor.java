
package Model;

import java.sql.Date;


public class Instrutor {
    private int idInstrutor;
    private String nomeInstrutor;
    private String cpf;
    private String endereco;
    private String telefone;
    private Date Datadenascimento;
    private String Planodeaula;
    
    
    public Instrutor() {
    }

    public Instrutor(int idInstrutor, String nomeInstrutor, String cpf, String endereco, String telefone, Date Datadenascimento, String Planodeaula) {
        this.idInstrutor = idInstrutor;
        this.nomeInstrutor = nomeInstrutor;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.Datadenascimento = Datadenascimento;
        this.Planodeaula = Planodeaula;
    }

    public int getIdInstrutor() {
        return idInstrutor;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDatadenascimento() {
        return Datadenascimento;
    }

    public String getPlanodeaula() {
        return Planodeaula;
    }

    public void setIdInstrutor(int idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDatadenascimento(Date Datadenascimento) {
        this.Datadenascimento = Datadenascimento;
    }

    public void setPlanodeaula(String Planodeaula) {
        this.Planodeaula = Planodeaula;
    }

    @Override
    public String toString() {
        return "Instrutor{" + "idInstrutor=" + idInstrutor + ", nomeInstrutor=" + nomeInstrutor + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", Datadenascimento=" + Datadenascimento + ", Planodeaula=" + Planodeaula + '}';
    }

    public void setDatadenascimento(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
