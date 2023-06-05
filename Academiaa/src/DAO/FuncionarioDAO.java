/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 181910174
 */
public class FuncionarioDAO {

    public void CadastrarFuncionarioDAO(Funcionario fVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql;
            sql = "insert into funcionario values (null, ?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, fVO.getRg());
            pst.setString(2, fVO.getNome());
            pst.setString(3, fVO.getSexo());
            pst.setString(4, fVO.getDtNasc());
            pst.setString(5, fVO.getCelular());
            pst.setString(6, fVO.getEmail());
            pst.setString(7, fVO.getEndereco());
            pst.setString(8, fVO.getCep());
            pst.setInt(9, fVO.getCartao());
            pst.setString(10, fVO.getDtAdmissao());
            pst.setInt(11, fVO.getSenha());

        } catch (Exception e) {
        }
    }

    public ArrayList<Funcionario> getFuncionariosDAO() throws SQLException {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from Funcionario";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getInt("IdFuncionario"));
                f.setRg(rs.getString("rg"));
                f.setNome(rs.getString("nome"));
                f.setSexo(rs.getString("SexoUsuario"));
                f.setDtNasc(rs.getString("dtNasc"));
                f.setCelular(rs.getString("celular"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setCep(rs.getString("cep"));
                f.setCartao(rs.getInt("cartao"));
                f.setDtAdmissao(rs.getString("dtAdmissao"));
                f.setSenha(rs.getInt("senha"));
                funcionarios.add(f);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
       
     return funcionarios;
}
    
}