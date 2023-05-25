package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.Cliente;


public class ClienteDAO {

    public void cadClienteDAO(Cliente cVO) {
        Connection con = Conexao.getConexao();
        try {
            String sql;
            sql = "insert into cliente values (null,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getEndereco());
            pst.setDate(3, cVO.getDataNascimento());
            pst.setFloat(4, cVO.getAltura());
            pst.setFloat(5, cVO.getPeso());
            pst.setString(6, cVO.getUltimoAcesso());
            pst.setString(7, cVO.getCpf());

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Cliente!\n"
                    + ex.getMessage());
        }

    }
    public ArrayList<Cliente> getClientesDAO() {// Inicio GET
        Connection con = Conexao.getConexao();
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            String sql = "select * from cliente";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("IDCliente"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setDataNascimento(rs.getDate("dataNascimento"));
                c.setAltura(rs.getFloat("altura"));
                c.setPeso(rs.getFloat("peso"));
                c.setImc(rs.getString("imc"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Cliente!\n"
                    + ex.getMessage());
        }
        return clientes;
    }//fimListar




}//fimDAO