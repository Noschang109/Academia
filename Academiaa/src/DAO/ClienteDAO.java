package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Cliente;
import java.util.Set;

public class ClienteDAO {

    public void cadastrarClienteDAO(Cliente cVO) {
        Connection con = Conexao.getConexao();
        try {
            String sql;
            sql = "insert into cliente values (null,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(0, cVO.getIdCliente());
            pst.setFloat(1, cVO.getPeso());
            pst.setString(2, cVO.getImc());
            pst.setString(3, cVO.getUltimoAcesso());
            pst.setString(4, cVO.getCpf());
            pst.setString(5, cVO.getNome());
            pst.setString(6, cVO.getEndereco());
            pst.setDate(7, cVO.getDataNascimento());
            pst.setString(8, cVO.getAltura());

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Cliente!\n"
                    + ex.getMessage());
        }

    }

    public void atualizaClienteByDoc(Cliente cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update cliente set peso = ?,imc = ? ,ultimoAcesso = ?, cpf = ? , nome = ? , endereco = ? , dataNascimento = ? , altura = ?  ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setFloat(1, cVO.getPeso());
            pst.setString(2, cVO.getImc());
            pst.setString(3, cVO.getUltimoAcesso());
            pst.setString(4, cVO.getCpf());
            pst.setString(5, cVO.getNome());
            pst.setString(6, cVO.getEndereco());
            pst.setDate(7, cVO.getDataNascimento());
            pst.setString(8, cVO.getAltura());
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar CPF!\n"
                    + ex.getMessage());
        }
    }

    public void deletarClienteDAO(String cpf) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from cliente where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar CPF!\n"
                    + ex.getMessage());
        }
    }

    public Cliente getClienteByDoc(String cpf) {
        Cliente c = new Cliente();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from clientes where cpf = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setIdCliente(rs.getInt("IdCliente"));
                c.setPeso(rs.getFloat("peso"));
                c.setImc(rs.getString("imc"));
                c.setUltimoAcesso(rs.getString("ultimoAcesso"));
                c.setCpf(rs.getString("cpf"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setDataNascimento(rs.getDate("dataNascimento"));
                c.setAltura(rs.getString("altura"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CPF!\n"
                    + ex.getMessage());
        }
        return c;
    }

}//fimDAO
