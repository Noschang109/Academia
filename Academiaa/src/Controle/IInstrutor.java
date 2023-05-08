package Controle;

import java.util.ArrayList;
import Model.Instrutor;

public class IInstrutor {

    ArrayList<Instrutor> instrutores = new ArrayList<>();
    int idInstrutor = 1;

    public int geraID() {
        return this.idInstrutor++;
    }

    public void addInstrutor(Instrutor c) {
        this.instrutores.add(c);
    }

    public ArrayList<Instrutor> GetClientes() {
        return this.instrutores;
    }

    public void removeCliente(Instrutor c) {
        this.instrutores.remove(c);
    }

    public void mockInstrutor() {
        Instrutor c1 = new Instrutor();
        c1.setIdInstrutor(this.geraID());
        c1.setNomeInstrutor("Mauro lima");
        c1.setCpf("0123456789");
        c1.setEndereco("Rua ipiranga 783");
        c1.setTelefone("51998968598");
        c1.setDatadenascimento("24/11/2000");
        this.addInstrutor(c1);

        Instrutor c2 = new Instrutor();
        c2.setIdInstrutor(this.geraID());
        c2.setNomeInstrutor("José henrique");
        c2.setCpf("29168546068");
        c2.setEndereco("Rua jose bonifacio");
        c2.setTelefone("51996323426");
        c2.setDatadenascimento("08/01/1994");
        this.addInstrutor(c2);
    }
    public Instrutor getInstrutor(String cpf) {
        Instrutor c = null;
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getCpf().equals(cpf)) {
                c = instrutor;
                break;
            }
        }
        return c;
    }


}
