/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 181910174
 */
public class ItemPedido {
    private int idVenda;
    private int idProduto;
    private int qtd;

    public ItemPedido(int idVenda, int idProduto, int qtd) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.qtd = qtd;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
