/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class PlanoTreino {
    private String carga;
    private String repeticoes;
    private String series;

    public PlanoTreino(String carga, String repeticoes, String series) {
        this.carga = carga;
        this.repeticoes = repeticoes;
        this.series = series;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "PlanoTreino{" + "carga=" + carga + ", repeticoes=" + repeticoes + ", series=" + series + '}';
    }
    
    
}
