/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesFactory;

import DAO.ClienteDAO;
import DAO.DAOFactory;
import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author 181910174
 */
public class ClienteServicos {

    public void cadCliente(Cliente cVO) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarClienteDAO(cVO);
    }
    
    public void atualizarCliente(Cliente cVO){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.atualizaClienteByDoc(cVO);
    }
    
    public void deletarCliente(String cpf){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarClienteDAO(cpf);
    }
    
    public Cliente buscarClienteByCPF(String cpf){
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.getClienteByDoc(cpf);
    }
    
   
}

